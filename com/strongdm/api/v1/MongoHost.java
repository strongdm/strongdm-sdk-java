package com.strongdm.api.v1;

public class MongoHost implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public MongoHost setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public MongoHost setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public MongoHost setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public MongoHost setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String authDatabase;

  public String getAuthDatabase() {
    return this.authDatabase;
  }

  public MongoHost setAuthDatabase(String in) {
    this.authDatabase = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public MongoHost setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public MongoHost setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public MongoHost setPassword(String in) {
    this.password = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public MongoHost setPort(int in) {
    this.port = in;
    return this;
  }
}
