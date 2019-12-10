package com.strongdm.api.v1;

// InternalException is used to specify an internal system error
public final class InternalException extends RpcException {
    static final long serialVersionUID = 1;

    public InternalException(String errorMessage) {
        super(errorMessage, 13);
    }
}