// Copyright 2020 StrongDM Inc
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Code generated by protogen. DO NOT EDIT.

package com.strongdm.api;

import com.strongdm.api.plumbing.PageIterator;
import com.strongdm.api.plumbing.PageResult;
import com.strongdm.api.plumbing.Plumbing;
import com.strongdm.api.plumbing.Spec.GetRequestMetadata;
import com.strongdm.api.plumbing.Spec.ListRequestMetadata;
import com.strongdm.api.plumbing.WorkflowApproversGrpc;
import com.strongdm.api.plumbing.WorkflowApproversPlumbing;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** WorkflowApprovers is an account with the ability to approve requests bound to a workflow. */
public class WorkflowApprovers implements SnapshotWorkflowApprovers {
  private final WorkflowApproversGrpc.WorkflowApproversBlockingStub stub;
  private final Client parent;

  public WorkflowApprovers(ManagedChannel channel, Client client) {

    this.stub = WorkflowApproversGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private WorkflowApprovers(
      WorkflowApproversGrpc.WorkflowApproversBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  /**
   * This function returns a copy of the WorkflowApprovers service which has the given deadline set
   * for all method calls.
   */
  public WorkflowApprovers withDeadlineAfter(long duration, TimeUnit units) {
    return new WorkflowApprovers(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  /** Create creates a new workflow approver */
  public WorkflowApproversCreateResponse create(WorkflowApprover workflowApprover)
      throws RpcException {
    WorkflowApproversPlumbing.WorkflowApproversCreateRequest.Builder builder =
        WorkflowApproversPlumbing.WorkflowApproversCreateRequest.newBuilder();
    builder.setWorkflowApprover(Plumbing.convertWorkflowApproverToPlumbing(workflowApprover));
    WorkflowApproversPlumbing.WorkflowApproversCreateRequest req = builder.build();
    WorkflowApproversPlumbing.WorkflowApproversCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(
                    this.parent.getCallCredentials("WorkflowApprovers.Create", req))
                .create(req);
      } catch (Exception e) {
        if (this.parent.shouldRetry(tries, e)) {
          tries++;
          this.parent.jitterSleep(tries);
          continue;
        }
        throw Plumbing.convertExceptionToPorcelain(e);
      }
      break;
    }
    return Plumbing.convertWorkflowApproversCreateResponseToPorcelain(plumbingResponse);
  }
  /** Get reads one workflow approver by ID. */
  public WorkflowApproverGetResponse get(String id) throws RpcException {
    WorkflowApproversPlumbing.WorkflowApproverGetRequest.Builder builder =
        WorkflowApproversPlumbing.WorkflowApproverGetRequest.newBuilder();
    if (this.parent.snapshotDate != null) {
      GetRequestMetadata.Builder metaBuilder = GetRequestMetadata.newBuilder();
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
      builder.setMeta(metaBuilder);
    }
    builder.setId((id));
    WorkflowApproversPlumbing.WorkflowApproverGetRequest req = builder.build();
    WorkflowApproversPlumbing.WorkflowApproverGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("WorkflowApprovers.Get", req))
                .get(req);
      } catch (Exception e) {
        if (this.parent.shouldRetry(tries, e)) {
          tries++;
          this.parent.jitterSleep(tries);
          continue;
        }
        throw Plumbing.convertExceptionToPorcelain(e);
      }
      break;
    }
    return Plumbing.convertWorkflowApproverGetResponseToPorcelain(plumbingResponse);
  }
  /** Delete deletes a workflow approver */
  public WorkflowApproversDeleteResponse delete(String id) throws RpcException {
    WorkflowApproversPlumbing.WorkflowApproversDeleteRequest.Builder builder =
        WorkflowApproversPlumbing.WorkflowApproversDeleteRequest.newBuilder();
    builder.setId((id));
    WorkflowApproversPlumbing.WorkflowApproversDeleteRequest req = builder.build();
    WorkflowApproversPlumbing.WorkflowApproversDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(
                    this.parent.getCallCredentials("WorkflowApprovers.Delete", req))
                .delete(req);
      } catch (Exception e) {
        if (this.parent.shouldRetry(tries, e)) {
          tries++;
          this.parent.jitterSleep(tries);
          continue;
        }
        throw Plumbing.convertExceptionToPorcelain(e);
      }
      break;
    }
    return Plumbing.convertWorkflowApproversDeleteResponseToPorcelain(plumbingResponse);
  }
  /** Lists existing workflow approvers. */
  public Iterable<WorkflowApprover> list(String filter, Object... args) throws RpcException {
    WorkflowApproversPlumbing.WorkflowApproversListRequest.Builder builder =
        WorkflowApproversPlumbing.WorkflowApproversListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    if (this.parent.pageLimit > 0) {
      metaBuilder.setLimit(this.parent.pageLimit);
    }
    if (this.parent.snapshotDate != null) {
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<WorkflowApprover>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page
          WorkflowApproversPlumbing.WorkflowApproversListRequest req = builder.build();
          WorkflowApproversPlumbing.WorkflowApproversListResponse plumbingResponse;
          int tries = 0;
          while (true) {
            try {
              plumbingResponse =
                  this.stub
                      .withCallCredentials(
                          this.parent.getCallCredentials("WorkflowApprovers.List", req))
                      .list(req);
            } catch (Exception e) {
              if (this.parent.shouldRetry(tries, e)) {
                tries++;
                this.parent.jitterSleep(tries);
                continue;
              }
              throw Plumbing.convertExceptionToPorcelain(e);
            }
            break;
          }

          List<WorkflowApprover> page =
              Plumbing.convertRepeatedWorkflowApproverToPorcelain(
                  plumbingResponse.getWorkflowApproversList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<WorkflowApprover>(page, hasNextCursor);
        };

    Iterator<WorkflowApprover> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}