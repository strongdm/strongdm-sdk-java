package com.strongdm.api.v1;

public class Athena implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public Athena setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public Athena setName(String in) {
    this.name = in;
    return this;
  }

  private int portOverride;
  // Port number override.
  public int getPortOverride() {
    return this.portOverride;
  }
  // Port number override.
  public Athena setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public Athena setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String accessKey;

  public String getAccessKey() {
    return this.accessKey;
  }

  public Athena setAccessKey(String in) {
    this.accessKey = in;
    return this;
  }

  private String secretAccessKey;

  public String getSecretAccessKey() {
    return this.secretAccessKey;
  }

  public Athena setSecretAccessKey(String in) {
    this.secretAccessKey = in;
    return this;
  }

  private String region;

  public String getRegion() {
    return this.region;
  }

  public Athena setRegion(String in) {
    this.region = in;
    return this;
  }

  private String output;

  public String getOutput() {
    return this.output;
  }

  public Athena setOutput(String in) {
    this.output = in;
    return this;
  }
}
