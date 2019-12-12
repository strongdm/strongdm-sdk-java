package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.Plumbing;
import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Client {
  private String apiAccessKey;
  private byte[] apiSecretKey;

  private final Nodes nodes;

  // Nodes are proxies in the strongDM network. They come in two flavors: relays,
  // which communicate with resources, and gateways, which communicate with
  // clients.
  public Nodes nodes() {
    return this.nodes;
  }

  private final Roles roles;

  // Roles are tools for controlling user access to resources. Each Role holds a
  // list of resources which they grant access to. Composite roles are a special
  // type of Role which have no resource associations of their own, but instead
  // grant access to the combined resources associated with a set of child roles.
  // Each user can be a member of one Role or composite role.
  public Roles roles() {
    return this.roles;
  }

  // Creates a new strongDM API client. Pass in the API hostname, port, and authentication token.
  public Client(String host, int port, String apiAccessKey, String apiSecretKey)
      throws RpcException {
    this.apiAccessKey = apiAccessKey;
    this.apiSecretKey = Base64.getDecoder().decode(apiSecretKey);
    try {
      NettyChannelBuilder builder = NettyChannelBuilder.forAddress(host, port);
      if (port == 443) {
        builder = builder.useTransportSecurity().sslContext(GrpcSslContexts.forClient().build());
      } else {
        builder = builder.usePlaintext();
      }
      this.channel = builder.build();
      this.nodes = new Nodes(this.channel, this);
      this.roles = new Roles(this.channel, this);

    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    this.testOptions = new HashMap<String, Object>();
  }

  protected io.grpc.CallCredentials getCallCredentials(
      String methodName, com.google.protobuf.Message req) {
    return new SigningCallCredential(this.apiAccessKey, this.sign(methodName, req.toByteArray()));
  }

  public String sign(String methodName, byte[] message) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    int day = calendar.get(Calendar.DATE);
    int month = calendar.get(Calendar.MONTH) + 1;
    int year = calendar.get(Calendar.YEAR);
    String datestring = String.format("%04d-%02d-%02d", year, month, day);
    try {
      byte[] signingKey = hmac_digest(this.apiSecretKey, datestring.getBytes("UTF-8"));
      signingKey = hmac_digest(signingKey, "sdm_api_v1".getBytes("UTF-8"));

      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      digest.update(methodName.getBytes("UTF-8"));
      digest.update("\n".getBytes("UTF-8"));
      digest.update(message);
      byte[] messageHash = digest.digest();
      return new String(Base64.getEncoder().encode(hmac_digest(signingKey, messageHash)));
    } catch (Exception e) {
      return "";
    }
  }

  private byte[] hmac_digest(byte[] key, byte[] message) {
    try {
      String HMAC_SHA256 = "HmacSHA256";
      Mac sha256_HMAC = Mac.getInstance(HMAC_SHA256);
      SecretKeySpec keySpec = new SecretKeySpec(key, HMAC_SHA256);
      sha256_HMAC.init(keySpec);
      return sha256_HMAC.doFinal(message);
    } catch (Exception e) {
      return new byte[] {};
    }
  }

  private final ManagedChannel channel;

  // Attempts to close the underlying grpc connection
  // and waits for ongoing calls to terminate. It will return
  // whether it succeeded before timing out.
  // Can be called with seconds, or with an explicit
  // time unit and count, or it will default to ten seconds.
  // Can be called multiple times safely.
  public boolean close() throws InterruptedException {
    return this.close(10, TimeUnit.SECONDS);
  }

  public boolean close(long secs) throws InterruptedException {
    return this.close(secs, TimeUnit.SECONDS);
  }

  public boolean close(long timeout, TimeUnit unit) throws InterruptedException {
    if (!this.channel.isShutdown()) {
      this.channel.shutdown();
    }
    if (this.channel.isTerminated()) {
      return true;
    }
    return this.channel.awaitTermination(timeout, unit);
  }

  protected Map<String, Object> testOptions;
}
