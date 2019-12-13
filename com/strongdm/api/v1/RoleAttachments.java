package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.RoleAttachmentsGrpc;
import com.strongdm.api.v1.plumbing.RoleAttachmentsPlumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// RoleAttachments represent relationships between composite roles and the roles
// that make up those composite roles. When a composite role is attached to another
// role, the permissions granted to members of the composite role are augmented to
// include the permissions granted to members of the attached role.
public class RoleAttachments {
  private final RoleAttachmentsGrpc.RoleAttachmentsBlockingStub stub;
  private final Client parent;

  public RoleAttachments(ManagedChannel channel, Client client) {

    this.stub = RoleAttachmentsGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private RoleAttachments(RoleAttachmentsGrpc.RoleAttachmentsBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the RoleAttachments service which has
  // the given deadline set for all method calls.
  public RoleAttachments withDeadlineAfter(long duration, TimeUnit units) {
    return new RoleAttachments(this.stub.withDeadlineAfter(duration, units), this.parent);
  }

  // Create registers a new RoleAttachment.
  public RoleAttachmentCreateResponse create(RoleAttachment roleAttachment) throws RpcException {
    RoleAttachmentsPlumbing.RoleAttachmentCreateRequest.Builder builder =
        RoleAttachmentsPlumbing.RoleAttachmentCreateRequest.newBuilder();
    builder.setRoleAttachment(Plumbing.roleAttachmentToPlumbing(roleAttachment));
    RoleAttachmentsPlumbing.RoleAttachmentCreateRequest req = builder.build();
    RoleAttachmentsPlumbing.RoleAttachmentCreateResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub
              .withCallCredentials(this.parent.getCallCredentials("RoleAttachments.Create", req))
              .create(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.roleAttachmentCreateResponseToPorcelain(plumbingResponse);
  }

  // Get reads one RoleAttachment by ID.
  public RoleAttachmentGetResponse get(String id) throws RpcException {
    RoleAttachmentsPlumbing.RoleAttachmentGetRequest.Builder builder =
        RoleAttachmentsPlumbing.RoleAttachmentGetRequest.newBuilder();
    builder.setId(id);
    RoleAttachmentsPlumbing.RoleAttachmentGetRequest req = builder.build();
    RoleAttachmentsPlumbing.RoleAttachmentGetResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub
              .withCallCredentials(this.parent.getCallCredentials("RoleAttachments.Get", req))
              .get(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.roleAttachmentGetResponseToPorcelain(plumbingResponse);
  }

  // Delete removes a RoleAttachment by ID.
  public RoleAttachmentDeleteResponse delete(String id) throws RpcException {
    RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest.Builder builder =
        RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest.newBuilder();
    builder.setId(id);
    RoleAttachmentsPlumbing.RoleAttachmentDeleteRequest req = builder.build();
    RoleAttachmentsPlumbing.RoleAttachmentDeleteResponse plumbingResponse;
    try {
      plumbingResponse =
          this.stub
              .withCallCredentials(this.parent.getCallCredentials("RoleAttachments.Delete", req))
              .delete(req);
    } catch (Exception e) {
      throw Plumbing.exceptionToPorcelain(e);
    }
    return Plumbing.roleAttachmentDeleteResponseToPorcelain(plumbingResponse);
  }

  // List gets a list of RoleAttachments matching a given set of criteria.
  public Iterable<RoleAttachment> list(String filter) throws RpcException {
    RoleAttachmentsPlumbing.RoleAttachmentListRequest.Builder builder =
        RoleAttachmentsPlumbing.RoleAttachmentListRequest.newBuilder();
    builder.setFilter(filter);

    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<RoleAttachment>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          RoleAttachmentsPlumbing.RoleAttachmentListRequest req = builder.build();
          RoleAttachmentsPlumbing.RoleAttachmentListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("RoleAttachments.List", req))
                  .list(req);

          List<RoleAttachment> page =
              Plumbing.repeatedRoleAttachmentToPorcelain(plumbingResponse.getRoleAttachmentsList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<RoleAttachment>(page, hasNextCursor);
        };

    Iterator<RoleAttachment> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
