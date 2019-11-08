package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// AlreadyExistsException is used when an entity already exists in the system
public final class AlreadyExistsException extends BaseException {
    static final long serialVersionUID = 1;

    private final ArrayList<String> entities;
    public List<String> getEntities() {
        return this.entities;
    }

    public AlreadyExistsException(String errorMessage, Collection<String> entities) {
        super(errorMessage);
        this.entities = new ArrayList<String>(entities);
    }
}