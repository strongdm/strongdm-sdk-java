package com.strongdm.api.v1;

public class ElasticacheRedis implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public ElasticacheRedis setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public ElasticacheRedis setName(String in) {
    this.name = in;
    return this;
  }

  private int portOverride;
  // Port number override.
  public int getPortOverride() {
    return this.portOverride;
  }
  // Port number override.
  public ElasticacheRedis setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public ElasticacheRedis setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public ElasticacheRedis setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public ElasticacheRedis setPassword(String in) {
    this.password = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public ElasticacheRedis setPort(int in) {
    this.port = in;
    return this;
  }

  private boolean tlsRequired;

  public boolean getTlsRequired() {
    return this.tlsRequired;
  }

  public ElasticacheRedis setTlsRequired(boolean in) {
    this.tlsRequired = in;
    return this;
  }
}
