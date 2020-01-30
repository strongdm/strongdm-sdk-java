package com.strongdm.api.v1;

import com.strongdm.api.v1.plumbing.PageIterator;
import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;
import com.strongdm.api.v1.plumbing.UserGrantsGrpc;
import com.strongdm.api.v1.plumbing.UserGrantsPlumbing;
import io.grpc.ManagedChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

// UserGrants represent relationships between composite roles and the roles
// that make up those composite roles. When a composite role is attached to another
// role, the permissions granted to members of the composite role are augmented to
// include the permissions granted to members of the attached role.
public class UserGrants {
  private final UserGrantsGrpc.UserGrantsBlockingStub stub;
  private final Client parent;

  public UserGrants(ManagedChannel channel, Client client) {

    this.stub = UserGrantsGrpc.newBlockingStub(channel);
    this.parent = client;
  }

  private UserGrants(UserGrantsGrpc.UserGrantsBlockingStub stub, Client client) {
    this.stub = stub;
    this.parent = client;
  }

  // This function returns a copy of the UserGrants service which has
  // the given deadline set for all method calls.
  public UserGrants withDeadlineAfter(long duration, TimeUnit units) {
    return new UserGrants(this.stub.withDeadlineAfter(duration, units), this.parent);
  }
  // Create registers a new UserGrant.
  public UserGrantCreateResponse create(UserGrant userGrant) throws RpcException {
    UserGrantsPlumbing.UserGrantCreateRequest.Builder builder =
        UserGrantsPlumbing.UserGrantCreateRequest.newBuilder();
    builder.setUserGrant(Plumbing.userGrantToPlumbing(userGrant));
    UserGrantsPlumbing.UserGrantCreateRequest req = builder.build();
    UserGrantsPlumbing.UserGrantCreateResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("UserGrants.Create", req))
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
    return Plumbing.userGrantCreateResponseToPorcelain(plumbingResponse);
  }
  // Get reads one UserGrant by ID.
  public UserGrantGetResponse get(String id) throws RpcException {
    UserGrantsPlumbing.UserGrantGetRequest.Builder builder =
        UserGrantsPlumbing.UserGrantGetRequest.newBuilder();
    builder.setId(id);
    UserGrantsPlumbing.UserGrantGetRequest req = builder.build();
    UserGrantsPlumbing.UserGrantGetResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("UserGrants.Get", req))
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
    return Plumbing.userGrantGetResponseToPorcelain(plumbingResponse);
  }
  // Delete removes a UserGrant by ID.
  public UserGrantDeleteResponse delete(String id) throws RpcException {
    UserGrantsPlumbing.UserGrantDeleteRequest.Builder builder =
        UserGrantsPlumbing.UserGrantDeleteRequest.newBuilder();
    builder.setId(id);
    UserGrantsPlumbing.UserGrantDeleteRequest req = builder.build();
    UserGrantsPlumbing.UserGrantDeleteResponse plumbingResponse;
    int tries = 0;
    while (true) {
      try {
        plumbingResponse =
            this.stub
                .withCallCredentials(this.parent.getCallCredentials("UserGrants.Delete", req))
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
    return Plumbing.userGrantDeleteResponseToPorcelain(plumbingResponse);
  }
  // List gets a list of UserGrants matching a given set of criteria.
  public Iterable<UserGrant> list(String filter, Object... args) throws RpcException {
    UserGrantsPlumbing.UserGrantListRequest.Builder builder =
        UserGrantsPlumbing.UserGrantListRequest.newBuilder();
    builder.setFilter(Plumbing.quoteFilterArgs(filter, args));
    ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
    Object pageSizeOption = this.parent.testOptions.get("PageSize");
    if (pageSizeOption instanceof Integer) {
      metaBuilder.setLimit((int) pageSizeOption);
    }
    builder.setMeta(metaBuilder);

    Supplier<PageResult<UserGrant>> pageFetcher =
        () -> {
          // Note: this closure captures and reuses the builder to set the next page

          UserGrantsPlumbing.UserGrantListRequest req = builder.build();
          UserGrantsPlumbing.UserGrantListResponse plumbingResponse;
          plumbingResponse =
              this.stub
                  .withCallCredentials(this.parent.getCallCredentials("UserGrants.List", req))
                  .list(req);

          List<UserGrant> page =
              Plumbing.repeatedUserGrantToPorcelain(plumbingResponse.getUserGrantsList());

          boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
          builder.setMeta(
              ListRequestMetadata.newBuilder()
                  .setCursor(plumbingResponse.getMeta().getNextCursor()));

          return new PageResult<UserGrant>(page, hasNextCursor);
        };

    Iterator<UserGrant> iterator = new PageIterator<>(pageFetcher);

    return () -> iterator;
  }
}
