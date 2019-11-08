package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// InternalException is used to specify an internal system error
public final class InternalException extends BaseException {
    static final long serialVersionUID = 1;

    public InternalException(String errorMessage) {
        super(errorMessage);
    }
}