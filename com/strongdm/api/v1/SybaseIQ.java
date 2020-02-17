package com.strongdm.api.v1;

public class SybaseIQ implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public SybaseIQ setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public SybaseIQ setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public SybaseIQ setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public SybaseIQ setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public SybaseIQ setUsername(String in) {
    this.username = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public SybaseIQ setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public SybaseIQ setPort(int in) {
    this.port = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public SybaseIQ setPassword(String in) {
    this.password = in;
    return this;
  }
}
