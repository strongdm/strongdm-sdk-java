package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.NodesGrpc;
import com.strongdm.api.v1.plumbing.NodesPlumbing;
import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// Nodes are proxies in the strongDM network. They come in two flavors: relays,
// which communicate with resources, and gateways, which communicate with
// clients.
public class Nodes {
  private final NodesGrpc.NodesBlockingStub stub;
  private final Client parent;

  public Nodes(ManagedChannel channel, Client client) {

    this.stub = NodesGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private Nodes(NodesGrpc.NodesBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the Nodes service which has
  // the given deadline set for all method calls.
  public Nodes withDeadlineAfter(long duration, TimeUnit units) {
    return new Nodes(this.stub.withDeadlineAfter(duration, units), this.parent);
  }

  // Create registers a new Node.
  public NodeCreateResponse create(Node node) throws RpcException {
    NodesPlumbing.NodeCreateRequest.Builder builder = NodesPlumbing.NodeCreateRequest.newBuilder();
    builder.setNode(Plumbing.nodeToPlumbing(node));
    NodesPlumbing.NodeCreateRequest req = builder.build();
    NodesPlumbing.NodeCreateResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub
              .withCallCredentials(this.parent.getCallCredentials("Nodes.Create", req))
              .create(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.nodeCreateResponseToPorcelain(plumbingResponse);
  }

  // Get reads one Node by ID.
  public NodeGetResponse get(String id) throws RpcException {
    NodesPlumbing.NodeGetRequest.Builder builder = NodesPlumbing.NodeGetRequest.newBuilder();
    builder.setId(id);
    NodesPlumbing.NodeGetRequest req = builder.build();
    NodesPlumbing.NodeGetResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub.withCallCredentials(this.parent.getCallCredentials("Nodes.Get", req)).get(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.nodeGetResponseToPorcelain(plumbingResponse);
  }

  // Update patches a Node by ID.
  public NodeUpdateResponse update(Node node) throws RpcException {
    NodesPlumbing.NodeUpdateRequest.Builder builder = NodesPlumbing.NodeUpdateRequest.newBuilder();
    builder.setNode(Plumbing.nodeToPlumbing(node));
    NodesPlumbing.NodeUpdateRequest req = builder.build();
    NodesPlumbing.NodeUpdateResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub
              .withCallCredentials(this.parent.getCallCredentials("Nodes.Update", req))
              .update(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.nodeUpdateResponseToPorcelain(plumbingResponse);
  }

  // Delete removes a Node by ID.
  public NodeDeleteResponse delete(String id) throws RpcException {
    NodesPlumbing.NodeDeleteRequest.Builder builder = NodesPlumbing.NodeDeleteRequest.newBuilder();
    builder.setId(id);
    NodesPlumbing.NodeDeleteRequest req = builder.build();
    NodesPlumbing.NodeDeleteResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub
              .withCallCredentials(this.parent.getCallCredentials("Nodes.Delete", req))
              .delete(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.nodeDeleteResponseToPorcelain(plumbingResponse);
  }

  // List gets a list of Nodes matching a given set of criteria.
  public Iterable<Node> list(String filter) throws RpcException {
    NodesPlumbing.NodeListRequest.Builder builder = NodesPlumbing.NodeListRequest.newBuilder();
    builder.setFilter(filter);

    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<Node>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          NodesPlumbing.NodeListRequest req = builder.build();
          NodesPlumbing.NodeListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("Nodes.List", req))
                  .list(req);

          List<Node> page = Plumbing.repeatedNodeToPorcelain(plumbingResponse.getNodesList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<Node>(page, hasNextCursor);
        };

    Iterator<Node> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
