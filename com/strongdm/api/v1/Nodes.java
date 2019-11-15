package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import io.grpc.ManagedChannel;

import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;

import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.PageIterator;


import com.strongdm.api.v1.plumbing.NodesGrpc;
import com.strongdm.api.v1.plumbing.NodesPlumbing;

import com.strongdm.api.v1.plumbing.RolesGrpc;
import com.strongdm.api.v1.plumbing.RolesPlumbing;

// Nodes are proxies in strongDM responsible to communicate with servers
// (relays) and clients (gateways).
public class Nodes {
    private final NodesGrpc.NodesBlockingStub stub;

    public Nodes(ManagedChannel channel, String apiKey) {
        JwtCallCredential callCredential = new JwtCallCredential(apiKey);
        this.stub = NodesGrpc.newBlockingStub(channel).withCallCredentials(callCredential);
    }
    
    // Create registers a new node.
    public NodeCreateResponse create(Node node) throws BaseException {
        NodesPlumbing.NodeCreateRequest.Builder builder = NodesPlumbing.NodeCreateRequest.newBuilder();
        builder.setNode(Plumbing.nodeToPlumbing(node));
        NodesPlumbing.NodeCreateRequest req = builder.build();
        NodesPlumbing.NodeCreateResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.create(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.nodeCreateResponseToPorcelain(plumbingResponse);
    }
    
    // Get reads one node by ID.
    public NodeGetResponse get(String id) throws BaseException {
        NodesPlumbing.NodeGetRequest.Builder builder = NodesPlumbing.NodeGetRequest.newBuilder();
        builder.setId(id);
        NodesPlumbing.NodeGetRequest req = builder.build();
        NodesPlumbing.NodeGetResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.get(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.nodeGetResponseToPorcelain(plumbingResponse);
    }
    
    // Update patches a node by ID.
    public NodeUpdateResponse update(Node node) throws BaseException {
        NodesPlumbing.NodeUpdateRequest.Builder builder = NodesPlumbing.NodeUpdateRequest.newBuilder();
        builder.setNode(Plumbing.nodeToPlumbing(node));
        NodesPlumbing.NodeUpdateRequest req = builder.build();
        NodesPlumbing.NodeUpdateResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.update(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.nodeUpdateResponseToPorcelain(plumbingResponse);
    }
    
    // Delete removes a node by ID.
    public NodeDeleteResponse delete(String id) throws BaseException {
        NodesPlumbing.NodeDeleteRequest.Builder builder = NodesPlumbing.NodeDeleteRequest.newBuilder();
        builder.setId(id);
        NodesPlumbing.NodeDeleteRequest req = builder.build();
        NodesPlumbing.NodeDeleteResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.delete(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.nodeDeleteResponseToPorcelain(plumbingResponse);
    }
    
    // List is a batched Get call.
    public Iterable<Node> list(String filter) throws BaseException {
        NodesPlumbing.NodeListRequest.Builder builder = NodesPlumbing.NodeListRequest.newBuilder();
        builder.setFilter(filter);

        ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
        metaBuilder.setLimit(25);
        builder.setMeta(metaBuilder);

        Supplier<PageResult<Node> > pageFetcher = () -> {
            // Note: this closure captures and reuses the builder to set the next page

            NodesPlumbing.NodeListRequest req = builder.build();
            NodesPlumbing.NodeListResponse plumbingResponse;
            plumbingResponse = this.stub.list(req);

            List<Node> page =
                Plumbing.repeatedNodeToPorcelain(plumbingResponse.getNodesList());

            boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
            metaBuilder.setCursor(plumbingResponse.getMeta().getNextCursor());
            builder.setMeta(metaBuilder);

            return new PageResult<Node>(page, hasNextCursor);
        };

        Iterator<Node> iterator = new PageIterator<>(pageFetcher);

        return () -> iterator;
    }
    
}

