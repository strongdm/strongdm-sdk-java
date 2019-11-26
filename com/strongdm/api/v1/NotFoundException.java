package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// NotFoundException is used when an entity does not exist in the system
public final class NotFoundException extends RpcException {
    static final long serialVersionUID = 1;

    private final String entity;
    public String getEntity() {
        return this.entity;
    }

    public NotFoundException(String errorMessage, String entity) {
        super(errorMessage, 5);
        this.entity = entity;
    }
}