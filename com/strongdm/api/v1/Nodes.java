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

// Nodes are proxies in strongDM responsible to communicate with servers
// (relays) and clients (gateways).
public class Nodes {
    private final NodesGrpc.NodesBlockingStub stub;

    public Nodes(ManagedChannel channel) {
        this.stub = NodesGrpc.newBlockingStub(channel);
    }
    
    // Create registers a new node.
    public NodeCreateResponse create(Collection<Node> nodes) throws BaseException {
        NodesPlumbing.NodeCreateRequest.Builder builder = NodesPlumbing.NodeCreateRequest.newBuilder();
        builder.addAllNodes(Plumbing.repeatedNodeToPlumbing(nodes));
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
    public NodeUpdateResponse update(String id, Node node) throws BaseException {
        NodesPlumbing.NodeUpdateRequest.Builder builder = NodesPlumbing.NodeUpdateRequest.newBuilder();
        builder.setId(id);
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
    public NodeListResponse list(String filter) throws BaseException {
        NodesPlumbing.NodeListRequest.Builder builder = NodesPlumbing.NodeListRequest.newBuilder();
        builder.setFilter(filter);

        NodeListResponse resp = new NodeListResponse();

        Supplier<PageResult<Node> > pageFetcher = () -> {
            // Note: this closure captures and reuses the builder to set the next page

            NodesPlumbing.NodeListRequest req = builder.build();
            NodesPlumbing.NodeListResponse plumbingResponse;
            plumbingResponse = this.stub.list(req);

            List<Node> page =
                Plumbing.repeatedNodeToPorcelain(plumbingResponse.getNodesList());
            boolean hasNextPage = plumbingResponse.getMeta().getNextPage() != "";

            ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
            metaBuilder.setPage(plumbingResponse.getMeta().getNextPage());
            builder.setMeta(metaBuilder);

            return new PageResult<Node>(page, hasNextPage);
        };

        Iterator<Node> iterator = new PageIterator<>(pageFetcher);

        resp.setNodes(() -> iterator);
        return resp;
    }
    
    // BatchUpdate is a batched Update call.
    public NodeBatchUpdateResponse batchUpdate(Collection<Node> nodes) throws BaseException {
        NodesPlumbing.NodeBatchUpdateRequest.Builder builder = NodesPlumbing.NodeBatchUpdateRequest.newBuilder();
        builder.addAllNodes(Plumbing.repeatedNodeToPlumbing(nodes));
        NodesPlumbing.NodeBatchUpdateRequest req = builder.build();
        NodesPlumbing.NodeBatchUpdateResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.batchUpdate(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.nodeBatchUpdateResponseToPorcelain(plumbingResponse);
    }
    
    // BatchDelete is a batched Delete call.
    public NodeBatchDeleteResponse batchDelete(Collection<String> ids) throws BaseException {
        NodesPlumbing.NodeBatchDeleteRequest.Builder builder = NodesPlumbing.NodeBatchDeleteRequest.newBuilder();
        builder.addAllIds(ids);
        NodesPlumbing.NodeBatchDeleteRequest req = builder.build();
        NodesPlumbing.NodeBatchDeleteResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.batchDelete(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.nodeBatchDeleteResponseToPorcelain(plumbingResponse);
    }
    
}
