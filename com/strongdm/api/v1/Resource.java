package com.strongdm.api.v1;

// A Resource is a proxy in the strongDM network. They come in two flavors: relays,
// which communicate with resources, and gateways, which communicate with
// clients.
public class Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public Resource setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public Resource setName(String in) {
    this.name = in;
    return this;
  }

  private int portOverride;
  // Port number override.
  public int getPortOverride() {
    return this.portOverride;
  }
  // Port number override.
  public Resource setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public Resource setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private Driver driver;
  // Fields for connecting to the resource.
  public Driver getDriver() {
    return this.driver;
  }
  // Fields for connecting to the resource.
  public Resource setDriver(Driver in) {
    this.driver = in;
    return this;
  }
}
