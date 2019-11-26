package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// AuthenticationException is used to specify an authentication failure condition
public final class AuthenticationException extends RpcException {
    static final long serialVersionUID = 1;

    public AuthenticationException(String errorMessage) {
        super(errorMessage, 16);
    }
}