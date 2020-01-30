package com.strongdm.api.v1;

import com.google.rpc.Code;
import com.strongdm.api.v1.plumbing.Plumbing;
import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Client {
  private String apiAccessKey;
  private byte[] apiSecretKey;

  private final int defaultMaxRetries = 3;
  private final int defaultBaseRetryDelay = 30; // 30 ms
  private final int defaultMaxRetryDelay = 300000; // 300 seconds

  private int maxRetries;
  private int baseRetryDelay;
  private int maxRetryDelay;
  private final Accounts accounts;

  // Accounts are users, services or tokens who connect to and act within the strongDM network.
  public Accounts accounts() {
    return this.accounts;
  }

  private final Nodes nodes;

  // Nodes are proxies in the strongDM network. They come in two flavors: relays,
  // which communicate with resources, and gateways, which communicate with
  // clients.
  public Nodes nodes() {
    return this.nodes;
  }

  private final Resources resources;

  public Resources resources() {
    return this.resources;
  }

  private final RoleAttachments roleAttachments;

  // RoleAttachments represent relationships between composite roles and the roles
  // that make up those composite roles. When a composite role is attached to another
  // role, the permissions granted to members of the composite role are augmented to
  // include the permissions granted to members of the attached role.
  public RoleAttachments roleAttachments() {
    return this.roleAttachments;
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

  private final UserGrants userGrants;

  // UserGrants represent relationships between composite roles and the roles
  // that make up those composite roles. When a composite role is attached to another
  // role, the permissions granted to members of the composite role are augmented to
  // include the permissions granted to members of the attached role.
  public UserGrants userGrants() {
    return this.userGrants;
  }
  // Creates a new strongDM API client. Pass in the API hostname, port, and authentication token.
  public Client(String host, int port, String apiAccessKey, String apiSecretKey)
      throws RpcException {
    this.apiAccessKey = apiAccessKey;
    this.apiSecretKey = Base64.getDecoder().decode(apiSecretKey);
    this.maxRetries = this.defaultMaxRetries;
    this.baseRetryDelay = this.defaultBaseRetryDelay;
    this.maxRetryDelay = this.defaultMaxRetryDelay;
    try {
      NettyChannelBuilder builder = NettyChannelBuilder.forAddress(host, port);
      if (port == 443) {
        builder = builder.useTransportSecurity().sslContext(GrpcSslContexts.forClient().build());
      } else {
        builder = builder.usePlaintext();
      }
      this.channel = builder.build();
      this.accounts = new Accounts(this.channel, this);
      this.nodes = new Nodes(this.channel, this);
      this.resources = new Resources(this.channel, this);
      this.roleAttachments = new RoleAttachments(this.channel, this);
      this.roles = new Roles(this.channel, this);
      this.userGrants = new UserGrants(this.channel, this);
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
    Calendar utcCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    int day = utcCalendar.get(Calendar.DATE);
    int month = utcCalendar.get(Calendar.MONTH) + 1;
    int year = utcCalendar.get(Calendar.YEAR);
    String utcdatestring = String.format("%04d-%02d-%02d", year, month, day);
    try {
      byte[] signingKey = hmac_digest(this.apiSecretKey, utcdatestring.getBytes("UTF-8"));
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

  public void jitterSleep(int iter) {
    int durMax = this.baseRetryDelay * (2 << iter);
    if (durMax > this.maxRetryDelay) {
      durMax = this.maxRetryDelay;
    }
    try {
      Thread.sleep(new Random().nextInt(durMax));
    } catch (Exception e) {
    }
  }

  public boolean shouldRetry(int iter, Exception e) {
    if (iter >= this.maxRetries - 1) {
      return false;
    }
    if (!(e instanceof io.grpc.StatusRuntimeException)) {
      return true;
    }
    com.google.rpc.Status status = io.grpc.protobuf.StatusProto.fromThrowable(e);

    return (status.getCode() == Code.INTERNAL_VALUE);
  }

  protected Map<String, Object> testOptions;
}
