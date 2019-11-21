
package com.strongdm.api.v1;

import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.StatusRuntimeException;
import com.strongdm.api.v1.plumbing.Plumbing;

public class Client {
    
    private final Nodes nodes;

    public Nodes nodes() {
        return this.nodes;
    }

    
    private final Roles roles;

    public Roles roles() {
        return this.roles;
    }

    
    public Client(String host, int port, String apiKey) throws BaseException {
        try {
            NettyChannelBuilder builder = NettyChannelBuilder.forAddress(host, port);
            if (port == 443) {
                builder = builder.useTransportSecurity().
                    sslContext(GrpcSslContexts.forClient());
            } else { 
                builder = builder.usePlaintext();
            }
            ManagedChannel channel = builder.build();
            this.nodes = new Nodes(channel, apiKey);
            this.roles = new Roles(channel, apiKey);
            
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
    }
}