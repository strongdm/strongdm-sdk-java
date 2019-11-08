package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// PermissionException is used to specify a permissions violation
public final class PermissionException extends BaseException {
    static final long serialVersionUID = 1;

    private final String permission;
    public String getPermission() {
        return this.permission;
    }
    private final ArrayList<String> entities;
    public List<String> getEntities() {
        return this.entities;
    }

    public PermissionException(String errorMessage, String permission, Collection<String> entities) {
        super(errorMessage);
        this.permission = permission;
        this.entities = new ArrayList<String>(entities);
    }
}