package com.strongdm.api.v1;

// A Resource is a server or service which clients connect to through relays.
public interface Resource {
  // Returns the unique identifier of the Resource.
  String getId();
}
