
package com.strongdm.api.v1;

import java.util.Map;
import java.util.HashMap;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.StatusRuntimeException;
import com.strongdm.api.v1.plumbing.Plumbing;

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
    public Client(String host, int port, String apiKey) throws BaseException {
        try {
            NettyChannelBuilder builder = NettyChannelBuilder.forAddress(host, port);
            if (port == 443) {
                builder = builder.useTransportSecurity().
                    sslContext(GrpcSslContexts.forClient().build());
            } else { 
                builder = builder.usePlaintext();
            }
            ManagedChannel channel = builder.build();
            this.nodes = new Nodes(channel, apiKey, this);
            this.roles = new Roles(channel, apiKey, this);
            
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        this.testOptions = new HashMap<String, Object>();
    }

    protected Map<String, Object> testOptions;
}