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

// This file was generated by protogen. DO NOT EDIT.

package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.SecretStoresGrpc;
import com.strongdm.api.v1.plumbing.SecretStoresPlumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// SecretStores are servers where resource secrets (passwords, keys) are stored.
public class SecretStores {
  private final SecretStoresGrpc.SecretStoresBlockingStub stub;
  private final Client parent;

  public SecretStores(ManagedChannel channel, Client client) {

    this.stub = SecretStoresGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private SecretStores(SecretStoresGrpc.SecretStoresBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the SecretStores service which has
  // the given deadline set for all method calls.
  public SecretStores withDeadlineAfter(long duration, TimeUnit units) {
    return new SecretStores(this.stub.withDeadlineAfter(duration, units), this.parent);
  }

  public SecretStoreCreateResponse create(SecretStore secretStore) throws RpcException {
    SecretStoresPlumbing.SecretStoreCreateRequest.Builder builder =
        SecretStoresPlumbing.SecretStoreCreateRequest.newBuilder();
    builder.setSecretStore(Plumbing.convertSecretStoreToPlumbing(secretStore));
    SecretStoresPlumbing.SecretStoreCreateRequest req = builder.build();
    SecretStoresPlumbing.SecretStoreCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("SecretStores.Create", req))
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
    return Plumbing.convertSecretStoreCreateResponseToPorcelain(plumbingResponse);
  }
  // Get reads one SecretStore by ID.
  public SecretStoreGetResponse get(String id) throws RpcException {
    SecretStoresPlumbing.SecretStoreGetRequest.Builder builder =
        SecretStoresPlumbing.SecretStoreGetRequest.newBuilder();
    builder.setId((id));
    SecretStoresPlumbing.SecretStoreGetRequest req = builder.build();
    SecretStoresPlumbing.SecretStoreGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("SecretStores.Get", req))
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
    return Plumbing.convertSecretStoreGetResponseToPorcelain(plumbingResponse);
  }
  // Update patches a SecretStore by ID.
  public SecretStoreUpdateResponse update(SecretStore secretStore) throws RpcException {
    SecretStoresPlumbing.SecretStoreUpdateRequest.Builder builder =
        SecretStoresPlumbing.SecretStoreUpdateRequest.newBuilder();
    builder.setSecretStore(Plumbing.convertSecretStoreToPlumbing(secretStore));
    SecretStoresPlumbing.SecretStoreUpdateRequest req = builder.build();
    SecretStoresPlumbing.SecretStoreUpdateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("SecretStores.Update", req))
                .update(req);
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
    return Plumbing.convertSecretStoreUpdateResponseToPorcelain(plumbingResponse);
  }
  // Delete removes a SecretStore by ID.
  public SecretStoreDeleteResponse delete(String id) throws RpcException {
    SecretStoresPlumbing.SecretStoreDeleteRequest.Builder builder =
        SecretStoresPlumbing.SecretStoreDeleteRequest.newBuilder();
    builder.setId((id));
    SecretStoresPlumbing.SecretStoreDeleteRequest req = builder.build();
    SecretStoresPlumbing.SecretStoreDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("SecretStores.Delete", req))
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
    return Plumbing.convertSecretStoreDeleteResponseToPorcelain(plumbingResponse);
  }
  // List gets a list of SecretStores matching a given set of criteria.
  public Iterable<SecretStore> list(String filter, Object... args) throws RpcException {
    SecretStoresPlumbing.SecretStoreListRequest.Builder builder =
        SecretStoresPlumbing.SecretStoreListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<SecretStore>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          SecretStoresPlumbing.SecretStoreListRequest req = builder.build();
          SecretStoresPlumbing.SecretStoreListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("SecretStores.List", req))
                  .list(req);

          List<SecretStore> page =
              Plumbing.convertRepeatedSecretStoreToPorcelain(
                  plumbingResponse.getSecretStoresList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<SecretStore>(page, hasNextCursor);
        };

    Iterator<SecretStore> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}