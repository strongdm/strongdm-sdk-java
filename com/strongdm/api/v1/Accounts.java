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

import com.strongdm.api.v1.plumbing.AccountsGrpc;
import com.strongdm.api.v1.plumbing.AccountsPlumbing;
import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// Accounts are users that have access to strongDM.
// There are two types of accounts:
// 1. **Regular users:** humans who are authenticated through username and password or SSO
// 2. **Service users:** machines that are authneticated using a service token
public class Accounts {
  private final AccountsGrpc.AccountsBlockingStub stub;
  private final Client parent;

  public Accounts(ManagedChannel channel, Client client) {

    this.stub = AccountsGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private Accounts(AccountsGrpc.AccountsBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the Accounts service which has
  // the given deadline set for all method calls.
  public Accounts withDeadlineAfter(long duration, TimeUnit units) {
    return new Accounts(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  // Create registers a new Account.
  public AccountCreateResponse create(Account account) throws RpcException {
    AccountsPlumbing.AccountCreateRequest.Builder builder =
        AccountsPlumbing.AccountCreateRequest.newBuilder();
    builder.setAccount(Plumbing.accountToPlumbing(account));
    AccountsPlumbing.AccountCreateRequest req = builder.build();
    AccountsPlumbing.AccountCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("Accounts.Create", req))
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
    return Plumbing.accountCreateResponseToPorcelain(plumbingResponse);
  }
  // Get reads one Account by ID.
  public AccountGetResponse get(String id) throws RpcException {
    AccountsPlumbing.AccountGetRequest.Builder builder =
        AccountsPlumbing.AccountGetRequest.newBuilder();
    builder.setId(id);
    AccountsPlumbing.AccountGetRequest req = builder.build();
    AccountsPlumbing.AccountGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("Accounts.Get", req))
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
    return Plumbing.accountGetResponseToPorcelain(plumbingResponse);
  }
  // Update patches a Account by ID.
  public AccountUpdateResponse update(Account account) throws RpcException {
    AccountsPlumbing.AccountUpdateRequest.Builder builder =
        AccountsPlumbing.AccountUpdateRequest.newBuilder();
    builder.setAccount(Plumbing.accountToPlumbing(account));
    AccountsPlumbing.AccountUpdateRequest req = builder.build();
    AccountsPlumbing.AccountUpdateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("Accounts.Update", req))
                .update(req);
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
    return Plumbing.accountUpdateResponseToPorcelain(plumbingResponse);
  }
  // Delete removes a Account by ID.
  public AccountDeleteResponse delete(String id) throws RpcException {
    AccountsPlumbing.AccountDeleteRequest.Builder builder =
        AccountsPlumbing.AccountDeleteRequest.newBuilder();
    builder.setId(id);
    AccountsPlumbing.AccountDeleteRequest req = builder.build();
    AccountsPlumbing.AccountDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("Accounts.Delete", req))
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
    return Plumbing.accountDeleteResponseToPorcelain(plumbingResponse);
  }
  // List gets a list of Accounts matching a given set of criteria.
  public Iterable<Account> list(String filter, Object... args) throws RpcException {
    AccountsPlumbing.AccountListRequest.Builder builder =
        AccountsPlumbing.AccountListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<Account>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          AccountsPlumbing.AccountListRequest req = builder.build();
          AccountsPlumbing.AccountListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("Accounts.List", req))
                  .list(req);

          List<Account> page =
              Plumbing.repeatedAccountToPorcelain(plumbingResponse.getAccountsList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<Account>(page, hasNextCursor);
        };

    Iterator<Account> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
