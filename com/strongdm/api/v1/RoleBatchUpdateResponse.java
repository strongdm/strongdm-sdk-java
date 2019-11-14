package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleBatchUpdateResponse returns a list of Roles updated via
// RoleBatchUpdateRequest.
public class RoleBatchUpdateResponse {

    private BatchUpdateResponseMetadata meta;
    public BatchUpdateResponseMetadata getMeta() {
        return this.meta;
    }
    public RoleBatchUpdateResponse setMeta(BatchUpdateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private ArrayList<Role> roles = new ArrayList<Role>();
    public List<Role> getRoles() {
        return this.roles;
    }
    public Role getRoles(int index) {
        return this.roles.get(index);
    }
    public int getRolesCount() {
        return this.roles.size();
    }
    public RoleBatchUpdateResponse setRoles(int index, Role v) {
        this.roles.set(index, v);
        return this;
    }
    public RoleBatchUpdateResponse removeRoles(int index) {
        this.roles.remove(index);
        return this;
    }
    public RoleBatchUpdateResponse addRoles(Role v) {
        this.roles.add(v);
        return this;
    }
    public RoleBatchUpdateResponse addAllRoles(Collection<Role> v) {
        this.roles.addAll(v);
        return this;
    }
    public RoleBatchUpdateResponse setRoles(Collection<Role> in) {
        this.roles = new ArrayList<>(in);
        return this;
    }
    public RoleBatchUpdateResponse clearRoles() {
        this.roles.clear();
        return this;
    }
}
