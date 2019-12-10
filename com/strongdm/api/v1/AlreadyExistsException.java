package com.strongdm.api.v1;

// AlreadyExistsException is used when an entity already exists in the system
public final class AlreadyExistsException extends RpcException {
  static final long serialVersionUID = 1;

  public AlreadyExistsException(String errorMessage) {
    super(errorMessage, 6);
  }
}
