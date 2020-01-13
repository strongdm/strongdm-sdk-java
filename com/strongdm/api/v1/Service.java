package com.strongdm.api.v1;

// A Service is a service account that can connect to resources they are granted
// directly, or granted via roles. Services are typically automated jobs.

public class Service implements Account {
  private String id;
  // Unique identifier of the Service.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Service.
  public Service setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Service.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Service.
  public Service setName(String in) {
    this.name = in;
    return this;
  }
}
