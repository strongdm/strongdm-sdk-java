package com.strongdm.api.v1;

// RpcException defines base class for all exceptions in the SDK
public class RpcException extends Exception {
  static final long serialVersionUID = 1;

  private long code;

  public RpcException(String errorMessage, long code) {
    super(errorMessage);
    this.code = code;
  }

  public long getCode() {
    return this.code;
  }
}
