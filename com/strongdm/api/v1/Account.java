package com.strongdm.api.v1;

// An Account is one of many types of users or tokens that can access StrongDM.
public interface Account {
  // Returns the unique identifier of the Account.
  String getId();
}
