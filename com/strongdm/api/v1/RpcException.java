package com.strongdm.api.v1;

// RpcException defines a generic RPC error exception
public class RpcException extends BaseException {
    static final long serialVersionUID = 1;

    private final long code;
    public long getCode() {
        return this.code;
    }

    public RpcException(String errorMessage, long code) {
        super(errorMessage);
        this.code = code;
    }
}