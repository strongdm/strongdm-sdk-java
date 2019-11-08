package com.strongdm.api.v1;

// BaseException defines base class for all exceptions in the SDK
public class BaseException extends Exception {
    public BaseException(String errorMessage) {
        super(errorMessage);
    }
}