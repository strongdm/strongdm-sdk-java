package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// RateLimitException is used for rate limit excess condition
public final class RateLimitException extends BaseException {
    static final long serialVersionUID = 1;

    public RateLimitException(String errorMessage) {
        super(errorMessage);
    }
}