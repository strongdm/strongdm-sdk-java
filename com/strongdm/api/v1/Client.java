
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

    
    public Client(String host, int port) throws BaseException {
        ManagedChannel channel;
        try {
            channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // Disable TLS for now
                .build();
            this.nodes = new Nodes(channel);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
    }
}