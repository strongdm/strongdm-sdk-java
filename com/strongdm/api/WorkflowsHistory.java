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
import com.strongdm.api.plumbing.Spec.ListRequestMetadata;
import com.strongdm.api.plumbing.WorkflowsHistoryGrpc;
import com.strongdm.api.plumbing.WorkflowsHistoryPlumbing;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** WorkflowsHistory provides records of all changes to the state of a Workflow. */
public class WorkflowsHistory {
  private final WorkflowsHistoryGrpc.WorkflowsHistoryBlockingStub stub;
  private final Client parent;
  private final Deadline deadline;

  public WorkflowsHistory(ManagedChannel channel, Client client) {
    this.stub = WorkflowsHistoryGrpc.newBlockingStub(channel);
    this.parent = client;
    this.deadline = null;
  }

  private WorkflowsHistory(
      WorkflowsHistoryGrpc.WorkflowsHistoryBlockingStub stub, Client client, Deadline deadline) {
    this.stub = stub;
    this.parent = client;
    this.deadline = deadline;
  }

  /**
   * This function returns a copy of the WorkflowsHistory service which has the given deadline set
   * for all method calls.
   */
  public WorkflowsHistory withDeadlineAfter(long duration, TimeUnit units) {
    Deadline deadline = Deadline.after(duration, units);
    return new WorkflowsHistory(this.stub.withDeadline(deadline), this.parent, deadline);
  }
  /** List gets a list of WorkflowHistory records matching a given set of criteria. */
  public Iterable<WorkflowHistory> list(String filter, Object... args) throws RpcException {
    WorkflowsHistoryPlumbing.WorkflowHistoryListRequest.Builder builder =
        WorkflowsHistoryPlumbing.WorkflowHistoryListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    if (this.parent.pageLimit > 0) {
      metaBuilder.setLimit(this.parent.pageLimit);
    }
    if (this.parent.snapshotDate != null) {
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<WorkflowHistory>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page
          WorkflowsHistoryPlumbing.WorkflowHistoryListRequest req = builder.build();
          WorkflowsHistoryPlumbing.WorkflowHistoryListResponse plumbingResponse;
          int tries = 0;
          while (true) {
            try {
              plumbingResponse =
                  this.stub
                      .withCallCredentials(
                          this.parent.getCallCredentials("WorkflowsHistory.List", req))
                      .list(req);
            } catch (Exception e) {
              if (this.parent.shouldRetry(tries, e, this.deadline)) {
                tries++;
                try {
                  Thread.sleep(this.parent.exponentialBackoff(tries, this.deadline));
                } catch (Exception ignored) {
                }
                continue;
              }
              throw Plumbing.convertExceptionToPorcelain(e);
            }
            break;
          }

          List<WorkflowHistory> page =
              Plumbing.convertRepeatedWorkflowHistoryToPorcelain(plumbingResponse.getHistoryList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<WorkflowHistory>(page, hasNextCursor);
        };

    Iterator<WorkflowHistory> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
