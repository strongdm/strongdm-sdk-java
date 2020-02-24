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
package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.AccountGrantsGrpc;
import com.strongdm.api.v1.plumbing.AccountGrantsPlumbing;
import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// AccountGrants represent relationships between composite roles and the roles
// that make up those composite roles. When a composite role is attached to another
// role, the permissions granted to members of the composite role are augmented to
// include the permissions granted to members of the attached role.
public class AccountGrants {
  private final AccountGrantsGrpc.AccountGrantsBlockingStub stub;
  private final Client parent;

  public AccountGrants(ManagedChannel channel, Client client) {

    this.stub = AccountGrantsGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private AccountGrants(AccountGrantsGrpc.AccountGrantsBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the AccountGrants service which has
  // the given deadline set for all method calls.
  public AccountGrants withDeadlineAfter(long duration, TimeUnit units) {
    return new AccountGrants(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  // Create registers a new AccountGrant.
  public AccountGrantCreateResponse create(AccountGrant accountGrant) throws RpcException {
    AccountGrantsPlumbing.AccountGrantCreateRequest.Builder builder =
        AccountGrantsPlumbing.AccountGrantCreateRequest.newBuilder();
    builder.setAccountGrant(Plumbing.accountGrantToPlumbing(accountGrant));
    AccountGrantsPlumbing.AccountGrantCreateRequest req = builder.build();
    AccountGrantsPlumbing.AccountGrantCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("AccountGrants.Create", req))
                .create(req);
      } catch (Exception e) {
        if (this.parent.shouldRetry(tries, e)) {
          tries++;
          this.parent.jitterSleep(tries);
          continue;
        }
        throw Plumbing.exceptionToPorcelain(e);
      }
      break;
    }
    return Plumbing.accountGrantCreateResponseToPorcelain(plumbingResponse);
  }
  // Get reads one AccountGrant by ID.
  public AccountGrantGetResponse get(String id) throws RpcException {
    AccountGrantsPlumbing.AccountGrantGetRequest.Builder builder =
        AccountGrantsPlumbing.AccountGrantGetRequest.newBuilder();
    builder.setId(id);
    AccountGrantsPlumbing.AccountGrantGetRequest req = builder.build();
    AccountGrantsPlumbing.AccountGrantGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("AccountGrants.Get", req))
                .get(req);
      } catch (Exception e) {
        if (this.parent.shouldRetry(tries, e)) {
          tries++;
          this.parent.jitterSleep(tries);
          continue;
        }
        throw Plumbing.exceptionToPorcelain(e);
      }
      break;
    }
    return Plumbing.accountGrantGetResponseToPorcelain(plumbingResponse);
  }
  // Delete removes a AccountGrant by ID.
  public AccountGrantDeleteResponse delete(String id) throws RpcException {
    AccountGrantsPlumbing.AccountGrantDeleteRequest.Builder builder =
        AccountGrantsPlumbing.AccountGrantDeleteRequest.newBuilder();
    builder.setId(id);
    AccountGrantsPlumbing.AccountGrantDeleteRequest req = builder.build();
    AccountGrantsPlumbing.AccountGrantDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("AccountGrants.Delete", req))
                .delete(req);
      } catch (Exception e) {
        if (this.parent.shouldRetry(tries, e)) {
          tries++;
          this.parent.jitterSleep(tries);
          continue;
        }
        throw Plumbing.exceptionToPorcelain(e);
      }
      break;
    }
    return Plumbing.accountGrantDeleteResponseToPorcelain(plumbingResponse);
  }
  // List gets a list of AccountGrants matching a given set of criteria.
  public Iterable<AccountGrant> list(String filter, Object... args) throws RpcException {
    AccountGrantsPlumbing.AccountGrantListRequest.Builder builder =
        AccountGrantsPlumbing.AccountGrantListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<AccountGrant>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          AccountGrantsPlumbing.AccountGrantListRequest req = builder.build();
          AccountGrantsPlumbing.AccountGrantListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("AccountGrants.List", req))
                  .list(req);

          List<AccountGrant> page =
              Plumbing.repeatedAccountGrantToPorcelain(plumbingResponse.getAccountGrantsList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<AccountGrant>(page, hasNextCursor);
        };

    Iterator<AccountGrant> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
