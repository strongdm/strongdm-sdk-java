package com.strongdm.api.v1;

public class SSH implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public SSH setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public SSH setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public SSH setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public SSH setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public SSH setUsername(String in) {
    this.username = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public SSH setPort(int in) {
    this.port = in;
    return this;
  }

  private String publicKey;

  public String getPublicKey() {
    return this.publicKey;
  }

  public SSH setPublicKey(String in) {
    this.publicKey = in;
    return this;
  }
}
