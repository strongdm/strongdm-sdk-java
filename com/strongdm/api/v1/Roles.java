package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import io.grpc.ManagedChannel;

import com.strongdm.api.v1.plumbing.Plumbing;
import com.strongdm.api.v1.plumbing.Spec.ListRequestMetadata;

import com.strongdm.api.v1.plumbing.PageResult;
import com.strongdm.api.v1.plumbing.PageIterator;


import com.strongdm.api.v1.plumbing.NodesGrpc;
import com.strongdm.api.v1.plumbing.NodesPlumbing;

import com.strongdm.api.v1.plumbing.RolesGrpc;
import com.strongdm.api.v1.plumbing.RolesPlumbing;

// Roles are
public class Roles {
    private final RolesGrpc.RolesBlockingStub stub;

    public Roles(ManagedChannel channel, String apiKey) {
        JwtCallCredential callCredential = new JwtCallCredential(apiKey);
        this.stub = RolesGrpc.newBlockingStub(channel).withCallCredentials(callCredential);
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
    public RoleUpdateResponse update(String id, Role role) throws BaseException {
        RolesPlumbing.RoleUpdateRequest.Builder builder = RolesPlumbing.RoleUpdateRequest.newBuilder();
        builder.setId(id);
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
    
    // List is a batched Get call.
    public Iterable<Role> list(String filter) throws BaseException {
        RolesPlumbing.RoleListRequest.Builder builder = RolesPlumbing.RoleListRequest.newBuilder();
        builder.setFilter(filter);

        ListRequestMetadata.Builder metaBuilder = ListRequestMetadata.newBuilder();
        metaBuilder.setLimit(25);
        builder.setMeta(metaBuilder);

        Supplier<PageResult<Role> > pageFetcher = () -> {
            // Note: this closure captures and reuses the builder to set the next page

            RolesPlumbing.RoleListRequest req = builder.build();
            RolesPlumbing.RoleListResponse plumbingResponse;
            plumbingResponse = this.stub.list(req);

            List<Role> page =
                Plumbing.repeatedRoleToPorcelain(plumbingResponse.getRolesList());

            boolean hasNextCursor = plumbingResponse.getMeta().getNextCursor() != "";
            metaBuilder.setCursor(plumbingResponse.getMeta().getNextCursor());
            builder.setMeta(metaBuilder);

            return new PageResult<Role>(page, hasNextCursor);
        };

        Iterator<Role> iterator = new PageIterator<>(pageFetcher);

        return () -> iterator;
    }
    
}
