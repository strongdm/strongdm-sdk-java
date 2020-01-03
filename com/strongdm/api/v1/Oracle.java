package com.strongdm.api.v1;

public class Oracle implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public Oracle setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public Oracle setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public Oracle setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public Oracle setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public Oracle setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public Oracle setPassword(String in) {
    this.password = in;
    return this;
  }

  private String database;

  public String getDatabase() {
    return this.database;
  }

  public Oracle setDatabase(String in) {
    this.database = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public Oracle setPort(int in) {
    this.port = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public Oracle setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private boolean tlsRequired;

  public boolean getTlsRequired() {
    return this.tlsRequired;
  }

  public Oracle setTlsRequired(boolean in) {
    this.tlsRequired = in;
    return this;
  }
}
