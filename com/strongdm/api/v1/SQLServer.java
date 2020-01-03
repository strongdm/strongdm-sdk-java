package com.strongdm.api.v1;

public class SQLServer implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public SQLServer setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public SQLServer setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public SQLServer setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public SQLServer setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public SQLServer setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public SQLServer setPassword(String in) {
    this.password = in;
    return this;
  }

  private String database;

  public String getDatabase() {
    return this.database;
  }

  public SQLServer setDatabase(String in) {
    this.database = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public SQLServer setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private String schema;

  public String getSchema() {
    return this.schema;
  }

  public SQLServer setSchema(String in) {
    this.schema = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public SQLServer setPort(int in) {
    this.port = in;
    return this;
  }

  private boolean overrideDatabase;

  public boolean getOverrideDatabase() {
    return this.overrideDatabase;
  }

  public SQLServer setOverrideDatabase(boolean in) {
    this.overrideDatabase = in;
    return this;
  }
}
