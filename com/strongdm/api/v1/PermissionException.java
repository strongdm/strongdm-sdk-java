package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// PermissionException is used to specify a permissions violation
public final class PermissionException extends BaseException {
    static final long serialVersionUID = 1;

    public PermissionException(String errorMessage) {
        super(errorMessage);
    }
}