package com.strongdm.api.v1;

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