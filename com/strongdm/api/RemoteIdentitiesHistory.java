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
import com.strongdm.api.plumbing.RemoteIdentitiesHistoryGrpc;
import com.strongdm.api.plumbing.RemoteIdentitiesHistoryPlumbing;
import com.strongdm.api.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** RemoteIdentitiesHistory records all changes to the state of a RemoteIdentity. */
public class RemoteIdentitiesHistory {
  private final RemoteIdentitiesHistoryGrpc.RemoteIdentitiesHistoryBlockingStub stub;
  private final Client parent;

  public RemoteIdentitiesHistory(ManagedChannel channel, Client client) {

    this.stub = RemoteIdentitiesHistoryGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private RemoteIdentitiesHistory(
      RemoteIdentitiesHistoryGrpc.RemoteIdentitiesHistoryBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  /**
   * This function returns a copy of the RemoteIdentitiesHistory service which has the given
   * deadline set for all method calls.
   */
  public RemoteIdentitiesHistory withDeadlineAfter(long duration, TimeUnit units) {
    return new RemoteIdentitiesHistory(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  /** List gets a list of RemoteIdentityHistory records matching a given set of criteria. */
  public Iterable<RemoteIdentityHistory> list(String filter, Object... args) throws RpcException {
    RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest.Builder builder =
        RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    if (this.parent.snapshotDate != null) {
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<RemoteIdentityHistory>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page
          RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListRequest req = builder.build();
          RemoteIdentitiesHistoryPlumbing.RemoteIdentityHistoryListResponse plumbingResponse;
          int tries = 0;
          while (true) {
            try {
              plumbingResponse =
                  this.stub
                      .withCallCredentials(
                          this.parent.getCallCredentials("RemoteIdentitiesHistory.List", req))
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

          List<RemoteIdentityHistory> page =
              Plumbing.convertRepeatedRemoteIdentityHistoryToPorcelain(
                  plumbingResponse.getHistoryList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<RemoteIdentityHistory>(page, hasNextCursor);
        };

    Iterator<RemoteIdentityHistory> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}