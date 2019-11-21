package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleGetResponse returns a requested Role.
public class RoleGetResponse {
    // Reserved for future use.
    private GetResponseMetadata meta;
    public GetResponseMetadata getMeta() {
        return this.meta;
    }
    public RoleGetResponse setMeta(GetResponseMetadata in) {
        this.meta = in;
        return this;
    }
    // The requested role.
    private Role role;
    public Role getRole() {
        return this.role;
    }
    public RoleGetResponse setRole(Role in) {
        this.role = in;
        return this;
    }
}
