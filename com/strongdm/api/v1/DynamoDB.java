package com.strongdm.api.v1;

public class DynamoDB implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public DynamoDB setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public DynamoDB setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public DynamoDB setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String endpoint;

  public String getEndpoint() {
    return this.endpoint;
  }

  public DynamoDB setEndpoint(String in) {
    this.endpoint = in;
    return this;
  }

  private String accessKey;

  public String getAccessKey() {
    return this.accessKey;
  }

  public DynamoDB setAccessKey(String in) {
    this.accessKey = in;
    return this;
  }

  private String secretAccessKey;

  public String getSecretAccessKey() {
    return this.secretAccessKey;
  }

  public DynamoDB setSecretAccessKey(String in) {
    this.secretAccessKey = in;
    return this;
  }

  private String region;

  public String getRegion() {
    return this.region;
  }

  public DynamoDB setRegion(String in) {
    this.region = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public DynamoDB setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }
}
