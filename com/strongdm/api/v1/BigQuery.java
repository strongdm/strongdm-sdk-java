package com.strongdm.api.v1;

public class BigQuery implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public BigQuery setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public BigQuery setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public BigQuery setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String privateKey;

  public String getPrivateKey() {
    return this.privateKey;
  }

  public BigQuery setPrivateKey(String in) {
    this.privateKey = in;
    return this;
  }

  private String project;

  public String getProject() {
    return this.project;
  }

  public BigQuery setProject(String in) {
    this.project = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public BigQuery setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private String endpoint;

  public String getEndpoint() {
    return this.endpoint;
  }

  public BigQuery setEndpoint(String in) {
    this.endpoint = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public BigQuery setUsername(String in) {
    this.username = in;
    return this;
  }
}
