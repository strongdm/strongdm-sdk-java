package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// AlreadyExistsException is used when an entity already exists in the system
public final class AlreadyExistsException extends BaseException {
    static final long serialVersionUID = 1;

    private final String entity;
    public String getEntity() {
        return this.entity;
    }

    public AlreadyExistsException(String errorMessage, String entity) {
        super(errorMessage);
        this.entity = entity;
    }
}