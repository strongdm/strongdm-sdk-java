package com.strongdm.api.v1;

// NotFoundException is used when an entity does not exist in the system
public final class NotFoundException extends RpcException {
    static final long serialVersionUID = 1;

    public NotFoundException(String errorMessage) {
        super(errorMessage, 5);
    }
}