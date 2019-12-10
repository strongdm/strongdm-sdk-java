package com.strongdm.api.v1;

// TimeoutException indicates an RPC call timed out.
public class TimeoutException extends RpcException {
  static final long serialVersionUID = 1;

  public TimeoutException(String errorMessage) {
    super(errorMessage, 4);
  }
}
