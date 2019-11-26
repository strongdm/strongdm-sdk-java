package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleGetResponse returns a requested Role.
public class RoleGetResponse {
    private GetResponseMetadata meta;
    // Reserved for future use.
    public GetResponseMetadata getMeta() {
        return this.meta;
    }
    // Reserved for future use.
    public RoleGetResponse setMeta(GetResponseMetadata in) {
        this.meta = in;
        return this;
    }
    private Role role;
    // The requested Role.
    public Role getRole() {
        return this.role;
    }
    // The requested Role.
    public RoleGetResponse setRole(Role in) {
        this.role = in;
        return this;
    }
}
