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
import com.strongdm.api.plumbing.PeeringGroupPeersGrpc;
import com.strongdm.api.plumbing.PeeringGroupPeersPlumbing;
import com.strongdm.api.plumbing.Plumbing;
import com.strongdm.api.plumbing.Spec.GetRequestMetadata;
import com.strongdm.api.plumbing.Spec.ListRequestMetadata;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** PeeringGroupPeers provides the building blocks necessary to link two peering groups. */
public class PeeringGroupPeers implements SnapshotPeeringGroupPeers {
  private final PeeringGroupPeersGrpc.PeeringGroupPeersBlockingStub stub;
  private final Client parent;

  public PeeringGroupPeers(ManagedChannel channel, Client client) {

    this.stub = PeeringGroupPeersGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private PeeringGroupPeers(
      PeeringGroupPeersGrpc.PeeringGroupPeersBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  /**
   * This function returns a copy of the PeeringGroupPeers service which has the given deadline set
   * for all method calls.
   */
  public PeeringGroupPeers withDeadlineAfter(long duration, TimeUnit units) {
    return new PeeringGroupPeers(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  /** Create links two peering groups. */
  public PeeringGroupPeerCreateResponse create(PeeringGroupPeer peeringGroupPeer)
      throws RpcException {
    PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest.Builder builder =
        PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest.newBuilder();
    builder.setPeeringGroupPeer(Plumbing.convertPeeringGroupPeerToPlumbing(peeringGroupPeer));
    PeeringGroupPeersPlumbing.PeeringGroupPeerCreateRequest req = builder.build();
    PeeringGroupPeersPlumbing.PeeringGroupPeerCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(
                    this.parent.getCallCredentials("PeeringGroupPeers.Create", req))
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
    return Plumbing.convertPeeringGroupPeerCreateResponseToPorcelain(plumbingResponse);
  }
  /** Delete unlinks two peering groups. */
  public PeeringGroupPeerDeleteResponse delete(String id) throws RpcException {
    PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest.Builder builder =
        PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest.newBuilder();
    builder.setId((id));
    PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteRequest req = builder.build();
    PeeringGroupPeersPlumbing.PeeringGroupPeerDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(
                    this.parent.getCallCredentials("PeeringGroupPeers.Delete", req))
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
    return Plumbing.convertPeeringGroupPeerDeleteResponseToPorcelain(plumbingResponse);
  }
  /** Get reads the information of one peering group link. */
  public PeeringGroupPeerGetResponse get(String id) throws RpcException {
    PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest.Builder builder =
        PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest.newBuilder();
    if (this.parent.snapshotDate != null) {
      GetRequestMetadata.Builder metaBuilder = GetRequestMetadata.newBuilder();
      metaBuilder.setSnapshotAt(Plumbing.convertTimestampToPlumbing(this.parent.snapshotDate));
      builder.setMeta(metaBuilder);
    }
    builder.setId((id));
    PeeringGroupPeersPlumbing.PeeringGroupPeerGetRequest req = builder.build();
    PeeringGroupPeersPlumbing.PeeringGroupPeerGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("PeeringGroupPeers.Get", req))
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
    return Plumbing.convertPeeringGroupPeerGetResponseToPorcelain(plumbingResponse);
  }
  /** List gets a list of peering group links. */
  public Iterable<PeeringGroupPeer> list(String filter, Object... args) throws RpcException {
    PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest.Builder builder =
        PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest.newBuilder();
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

    Supplier<PageResult<PeeringGroupPeer>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page
          PeeringGroupPeersPlumbing.PeeringGroupPeerListRequest req = builder.build();
          PeeringGroupPeersPlumbing.PeeringGroupPeerListResponse plumbingResponse;
          int tries = 0;
          while (true) {
            try {
              plumbingResponse =
                  this.stub
                      .withCallCredentials(
                          this.parent.getCallCredentials("PeeringGroupPeers.List", req))
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

          List<PeeringGroupPeer> page =
              Plumbing.convertRepeatedPeeringGroupPeerToPorcelain(
                  plumbingResponse.getPeeringGroupPeersList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<PeeringGroupPeer>(page, hasNextCursor);
        };

    Iterator<PeeringGroupPeer> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}