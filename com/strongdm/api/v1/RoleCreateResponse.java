package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.google.protobuf.Timestamp;

// RoleCreateResponse reports how the Roles were created in the system. It can
// communicate partial successes or failures.
public class RoleCreateResponse {
    private CreateResponseMetadata meta;
    // Reserved for future use.
    public CreateResponseMetadata getMeta() {
        return this.meta;
    }
    // Reserved for future use.
    public RoleCreateResponse setMeta(CreateResponseMetadata in) {
        this.meta = in;
        return this;
    }
    private Role role;
    // The created Role.
    public Role getRole() {
        return this.role;
    }
    // The created Role.
    public RoleCreateResponse setRole(Role in) {
        this.role = in;
        return this;
    }
    private RateLimitMetadata rateLimit;
    // Rate limit information.
    public RateLimitMetadata getRateLimit() {
        return this.rateLimit;
    }
    // Rate limit information.
    public RoleCreateResponse setRateLimit(RateLimitMetadata in) {
        this.rateLimit = in;
        return this;
    }
}
