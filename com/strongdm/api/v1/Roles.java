package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.concurrent.TimeUnit;
import io.grpc.ManagedChannel;

import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;

import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.PageIterator;


import com.strongdm.api.v1.plumbing.NodesGrpc;
import com.strongdm.api.v1.plumbing.NodesPlumbing;

import com.strongdm.api.v1.plumbing.RolesGrpc;
import com.strongdm.api.v1.plumbing.RolesPlumbing;

// Roles are tools for controlling user access to resources. Each role holds a
// list of resources which they grant access to. Composite roles are a special
// type of role which have no resource associations of their own, but instead
// grant access to the combined resources associated with a set of child roles.
// Each user can be a member of one role or composite role.
public class Roles {
    private final RolesGrpc.RolesBlockingStub stub;
    private final Client parent;

    public Roles(ManagedChannel channel, String apiKey, Client client) {
        JwtCallCredential callCredential = new JwtCallCredential(apiKey);
        this.stub = RolesGrpc.newBlockingStub(channel).withCallCredentials(callCredential);
        this.parent = client;
    }

    private Roles(RolesGrpc.RolesBlockingStub stub, Client client) {
        this.stub = stub;
        this.parent = client;
    }

    public Roles withDeadlineAfter(long duration, TimeUnit units) {
        return new Roles(this.stub.withDeadlineAfter(duration, units), this.parent);
    }

    
    // Create registers a new role.
    public RoleCreateResponse create(Role role) throws BaseException {
        RolesPlumbing.RoleCreateRequest.Builder builder = RolesPlumbing.RoleCreateRequest.newBuilder();
        builder.setRole(Plumbing.roleToPlumbing(role));
        RolesPlumbing.RoleCreateRequest req = builder.build();
        RolesPlumbing.RoleCreateResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.create(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.roleCreateResponseToPorcelain(plumbingResponse);
    }
    
    // Get reads one role by ID.
    public RoleGetResponse get(String id) throws BaseException {
        RolesPlumbing.RoleGetRequest.Builder builder = RolesPlumbing.RoleGetRequest.newBuilder();
        builder.setId(id);
        RolesPlumbing.RoleGetRequest req = builder.build();
        RolesPlumbing.RoleGetResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.get(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.roleGetResponseToPorcelain(plumbingResponse);
    }
    
    // Update patches a Role by ID.
    public RoleUpdateResponse update(Role role) throws BaseException {
        RolesPlumbing.RoleUpdateRequest.Builder builder = RolesPlumbing.RoleUpdateRequest.newBuilder();
        builder.setRole(Plumbing.roleToPlumbing(role));
        RolesPlumbing.RoleUpdateRequest req = builder.build();
        RolesPlumbing.RoleUpdateResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.update(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.roleUpdateResponseToPorcelain(plumbingResponse);
    }
    
    // Delete removes a Role by ID.
    public RoleDeleteResponse delete(String id) throws BaseException {
        RolesPlumbing.RoleDeleteRequest.Builder builder = RolesPlumbing.RoleDeleteRequest.newBuilder();
        builder.setId(id);
        RolesPlumbing.RoleDeleteRequest req = builder.build();
        RolesPlumbing.RoleDeleteResponse plumbingResponse;
        try {
            plumbingResponse = this.stub.delete(req);
        } catch(Exception e) {
            throw Plumbing.exceptionToPorcelain(e);
        }
        return Plumbing.roleDeleteResponseToPorcelain(plumbingResponse);
    }
    
    // List gets a list of Roles matching a given set of criteria.
    public Iterable<Role> list(String filter) throws BaseException {
        RolesPlumbing.RoleListRequest.Builder builder = RolesPlumbing.RoleListRequest.newBuilder();
        builder.setFilter(filter);

        ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
        Object pageSizeOption = this.parent.testOptions.get("PageSize");
        if (pageSizeOption instanceof Integer) {
            metaBuilder.setLimit((int)pageSizeOption);
        }
        builder.setMeta(metaBuilder);

        Supplier<PageResult<Role> > pageFetcher = () -> {
            // Note: this closure captures and reuses the builder to set the next page

            RolesPlumbing.RoleListRequest req = builder.build();
            RolesPlumbing.RoleListResponse plumbingResponse;
            plumbingResponse = this.stub.list(req);

            List<Role> page =
                Plumbing.repeatedRoleToPorcelain(plumbingResponse.getRolesList());

            boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
            builder.setMeta(ListRequestMetadata.newBuilder().setCursor(plumbingResponse.getMeta().getNextCursor()));

            return new PageResult<Role>(page, hasNextCursor);
        };

        Iterator<Role> iterator = new PageIterator<>(pageFetcher);

        return () -> iterator;
    }
    
}
