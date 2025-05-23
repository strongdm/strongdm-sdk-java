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

import com.strongdm.api.plumbing.AccountAttachmentsGrpc;
import com.strongdm.api.plumbing.AccountAttachmentsPlumbing;
import com.strongdm.api.plumbing.PageIterator;
import com.strongdm.api.plumbing.PageResult;
import com.strongdm.api.plumbing.Plumbing;
import com.strongdm.api.plumbing.Spec.GetRequestMetadata;
import com.strongdm.api.plumbing.Spec.ListRequestMetadata;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** AccountAttachments assign an account to a role. */
public class AccountAttachments implements SnapshotAccountAttachments {
  private final AccountAttachmentsGrpc.AccountAttachmentsBlockingStub stub;
  private final Client parent;
  private final Deadline deadline;

  public AccountAttachments(ManagedChannel channel, Client client) {
    this.stub = AccountAttachmentsGrpc.newBlockingStub(channel);
    this.parent = client;
    this.deadline = null;
  }

  private AccountAttachments(
      AccountAttachmentsGrpc.AccountAttachmentsBlockingStub stub,
      Client client,
      Deadline deadline) {
    this.stub = stub;
    this.parent = client;
    this.deadline = deadline;
  }

  /**
   * This function returns a copy of the AccountAttachments service which has the given deadline set
   * for all method calls.
   */
  public AccountAttachments withDeadlineAfter(long duration, TimeUnit units) {
    Deadline deadline = Deadline.after(duration, units);
    return new AccountAttachments(this.stub.withDeadline(deadline), this.parent, deadline);
  }
  /** Create registers a new AccountAttachment. */
  public AccountAttachmentCreateResponse create(AccountAttachment accountAttachment)
      throws RpcException {
    AccountAttachmentsPlumbing.AccountAttachmentCreateRequest.Builder builder =
        AccountAttachmentsPlumbing.AccountAttachmentCreateRequest.newBuilder();
    builder.setAccountAttachment(Plumbing.convertAccountAttachmentToPlumbing(accountAttachment));
    AccountAttachmentsPlumbing.AccountAttachmentCreateRequest req = builder.build();
    AccountAttachmentsPlumbing.AccountAttachmentCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(
                    this.parent.getCallCredentials("AccountAttachments.Create", req))
                .create(req);
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
    return Plumbing.convertAccountAttachmentCreateResponseToPorcelain(plumbingResponse);
  }
  /** Get reads one AccountAttachment by ID. */
  public AccountAttachmentGetResponse get(String id) throws RpcException {
    AccountAttachmentsPlumbing.AccountAttachmentGetRequest.Builder builder =
        AccountAttachmentsPlumbing.AccountAttachmentGetRequest.newBuilder();
    if (this.parent.snapshotDate != null) {
      GetRequestMetadata.Builder metaBuilder = GetRequestMetadata.newBuilder();
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
      builder.setMeta(metaBuilder);
    }
    builder.setId((id));
    AccountAttachmentsPlumbing.AccountAttachmentGetRequest req = builder.build();
    AccountAttachmentsPlumbing.AccountAttachmentGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("AccountAttachments.Get", req))
                .get(req);
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
    return Plumbing.convertAccountAttachmentGetResponseToPorcelain(plumbingResponse);
  }
  /** Delete removes a AccountAttachment by ID. */
  public AccountAttachmentDeleteResponse delete(String id) throws RpcException {
    AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest.Builder builder =
        AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest.newBuilder();
    builder.setId((id));
    AccountAttachmentsPlumbing.AccountAttachmentDeleteRequest req = builder.build();
    AccountAttachmentsPlumbing.AccountAttachmentDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(
                    this.parent.getCallCredentials("AccountAttachments.Delete", req))
                .delete(req);
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
    return Plumbing.convertAccountAttachmentDeleteResponseToPorcelain(plumbingResponse);
  }
  /** List gets a list of AccountAttachments matching a given set of criteria. */
  public Iterable<AccountAttachment> list(String filter, Object... args) throws RpcException {
    AccountAttachmentsPlumbing.AccountAttachmentListRequest.Builder builder =
        AccountAttachmentsPlumbing.AccountAttachmentListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    if (this.parent.pageLimit > 0) {
      metaBuilder.setLimit(this.parent.pageLimit);
    }
    if (this.parent.snapshotDate != null) {
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<AccountAttachment>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page
          AccountAttachmentsPlumbing.AccountAttachmentListRequest req = builder.build();
          AccountAttachmentsPlumbing.AccountAttachmentListResponse plumbingResponse;
          int tries = 0;
          while (true) {
            try {
              plumbingResponse =
                  this.stub
                      .withCallCredentials(
                          this.parent.getCallCredentials("AccountAttachments.List", req))
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

          List<AccountAttachment> page =
              Plumbing.convertRepeatedAccountAttachmentToPorcelain(
                  plumbingResponse.getAccountAttachmentsList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<AccountAttachment>(page, hasNextCursor);
        };

    Iterator<AccountAttachment> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
