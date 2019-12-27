package com.strongdm.api.v1;

public class Athena implements Driver {
  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public Athena setHostname(String in) {
    this.hostname = in;
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
