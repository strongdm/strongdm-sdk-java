
package com.strongdm.api.v1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // Disable TLS for now
                .build();
            this.nodes = new Nodes(channel, apiKey);
            this.roles = new Roles(channel, apiKey);
            
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
    }
}