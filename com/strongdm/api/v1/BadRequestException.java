package com.strongdm.api.v1;

// BadRequestException identifies a bad request sent by the client
public final class BadRequestException extends RpcException {
  static final long serialVersionUID = 1;

  public BadRequestException(String errorMessage) {
    super(errorMessage, 3);
  }
}
