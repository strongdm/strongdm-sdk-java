package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// RateLimitException is used for rate limit excess condition
public final class RateLimitException extends RpcException {
    static final long serialVersionUID = 1;

    private final RateLimitMetadata rateLimit;
    public RateLimitMetadata getRateLimit() {
        return this.rateLimit;
    }

    public RateLimitException(String errorMessage, RateLimitMetadata rateLimit) {
        super(errorMessage, 8);
        this.rateLimit = rateLimit;
    }
}