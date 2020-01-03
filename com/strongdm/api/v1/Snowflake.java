package com.strongdm.api.v1;

public class Snowflake implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public Snowflake setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public Snowflake setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public Snowflake setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public Snowflake setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public Snowflake setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public Snowflake setPassword(String in) {
    this.password = in;
    return this;
  }

  private String database;

  public String getDatabase() {
    return this.database;
  }

  public Snowflake setDatabase(String in) {
    this.database = in;
    return this;
  }

  private String schema;

  public String getSchema() {
    return this.schema;
  }

  public Snowflake setSchema(String in) {
    this.schema = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public Snowflake setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }
}
