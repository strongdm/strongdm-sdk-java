package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleUpdateResponse returns the fields of a Role after it has been updated by
// a RoleUpdateRequest.
public class RoleUpdateResponse {

    private UpdateResponseMetadata meta;
    public UpdateResponseMetadata getMeta() {
        return this.meta;
    }
    public RoleUpdateResponse setMeta(UpdateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private Role role;
    public Role getRole() {
        return this.role;
    }
    public RoleUpdateResponse setRole(Role in) {
        this.role = in;
        return this;
    }
}
