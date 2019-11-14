package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleCreateResponse reports how the Roles were created in the system. It can
// communicate partial successes or failures.
public class RoleCreateResponse {

    private CreateResponseMetadata meta;
    public CreateResponseMetadata getMeta() {
        return this.meta;
    }
    public RoleCreateResponse setMeta(CreateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private Role role;
    public Role getRole() {
        return this.role;
    }
    public RoleCreateResponse setRole(Role in) {
        this.role = in;
        return this;
    }
}
