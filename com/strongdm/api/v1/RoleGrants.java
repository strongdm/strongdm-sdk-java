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

import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.RoleGrantsGrpc;
import com.strongdm.api.v1.plumbing.RoleGrantsPlumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// RoleGrants represent relationships between composite roles and the roles
// that make up those composite roles. When a composite role is attached to another
// role, the permissions granted to members of the composite role are augmented to
// include the permissions granted to members of the attached role.
public class RoleGrants {
  private final RoleGrantsGrpc.RoleGrantsBlockingStub stub;
  private final Client parent;

  public RoleGrants(ManagedChannel channel, Client client) {

    this.stub = RoleGrantsGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private RoleGrants(RoleGrantsGrpc.RoleGrantsBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the RoleGrants service which has
  // the given deadline set for all method calls.
  public RoleGrants withDeadlineAfter(long duration, TimeUnit units) {
    return new RoleGrants(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  // Create registers a new RoleGrant.
  public RoleGrantCreateResponse create(RoleGrant roleGrant) throws RpcException {
    RoleGrantsPlumbing.RoleGrantCreateRequest.Builder builder =
        RoleGrantsPlumbing.RoleGrantCreateRequest.newBuilder();
    builder.setRoleGrant(Plumbing.roleGrantToPlumbing(roleGrant));
    RoleGrantsPlumbing.RoleGrantCreateRequest req = builder.build();
    RoleGrantsPlumbing.RoleGrantCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("RoleGrants.Create", req))
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
    return Plumbing.roleGrantCreateResponseToPorcelain(plumbingResponse);
  }
  // Get reads one RoleGrant by ID.
  public RoleGrantGetResponse get(String id) throws RpcException {
    RoleGrantsPlumbing.RoleGrantGetRequest.Builder builder =
        RoleGrantsPlumbing.RoleGrantGetRequest.newBuilder();
    builder.setId(id);
    RoleGrantsPlumbing.RoleGrantGetRequest req = builder.build();
    RoleGrantsPlumbing.RoleGrantGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("RoleGrants.Get", req))
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
    return Plumbing.roleGrantGetResponseToPorcelain(plumbingResponse);
  }
  // Delete removes a RoleGrant by ID.
  public RoleGrantDeleteResponse delete(String id) throws RpcException {
    RoleGrantsPlumbing.RoleGrantDeleteRequest.Builder builder =
        RoleGrantsPlumbing.RoleGrantDeleteRequest.newBuilder();
    builder.setId(id);
    RoleGrantsPlumbing.RoleGrantDeleteRequest req = builder.build();
    RoleGrantsPlumbing.RoleGrantDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("RoleGrants.Delete", req))
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
    return Plumbing.roleGrantDeleteResponseToPorcelain(plumbingResponse);
  }
  // List gets a list of RoleGrants matching a given set of criteria.
  public Iterable<RoleGrant> list(String filter, Object... args) throws RpcException {
    RoleGrantsPlumbing.RoleGrantListRequest.Builder builder =
        RoleGrantsPlumbing.RoleGrantListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<RoleGrant>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          RoleGrantsPlumbing.RoleGrantListRequest req = builder.build();
          RoleGrantsPlumbing.RoleGrantListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("RoleGrants.List", req))
                  .list(req);

          List<RoleGrant> page =
              Plumbing.repeatedRoleGrantToPorcelain(plumbingResponse.getRoleGrantsList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<RoleGrant>(page, hasNextCursor);
        };

    Iterator<RoleGrant> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
