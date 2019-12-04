package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleDeleteResponse returns information about a Role that was deleted.
public class RoleDeleteResponse {
    private DeleteResponseMetadata meta;
    // Reserved for future use.
    public DeleteResponseMetadata getMeta() {
        return this.meta;
    }
    // Reserved for future use.
    public RoleDeleteResponse setMeta(DeleteResponseMetadata in) {
        this.meta = in;
        return this;
    }
    private RateLimitMetadata rateLimit;
    // Rate limit information.
    public RateLimitMetadata getRateLimit() {
        return this.rateLimit;
    }
    // Rate limit information.
    public RoleDeleteResponse setRateLimit(RateLimitMetadata in) {
        this.rateLimit = in;
        return this;
    }
}
