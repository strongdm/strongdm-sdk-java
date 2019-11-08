package com.strongdm.api.v1;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// BadRequestException identifies a bad request sent by the client
public final class BadRequestException extends BaseException {
    static final long serialVersionUID = 1;

    public BadRequestException(String errorMessage) {
        super(errorMessage);
    }
}