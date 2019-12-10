package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.Plumbing;
import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Client {

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
  public Client(String host, int port, String apiKey) throws RpcException {
    try {
      NettyChannelBuilder builder = NettyChannelBuilder.forAddress(host, port);
      if (port == 443) {
        builder = builder.useTransportSecurity().sslContext(GrpcSslContexts.forClient().build());
      } else {
        builder = builder.usePlaintext();
      }
      this.channel = builder.build();
      this.nodes = new Nodes(this.channel, apiKey, this);
      this.roles = new Roles(this.channel, apiKey, this);

    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    this.testOptions = new HashMap<String, Object>();
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
