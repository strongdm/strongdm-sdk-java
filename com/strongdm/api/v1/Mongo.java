package com.strongdm.api.v1;

public class Mongo implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public Mongo setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public Mongo setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public Mongo setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public Mongo setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String authDatabase;

  public String getAuthDatabase() {
    return this.authDatabase;
  }

  public Mongo setAuthDatabase(String in) {
    this.authDatabase = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public Mongo setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public Mongo setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public Mongo setPassword(String in) {
    this.password = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public Mongo setPort(int in) {
    this.port = in;
    return this;
  }

  private String replicaSet;

  public String getReplicaSet() {
    return this.replicaSet;
  }

  public Mongo setReplicaSet(String in) {
    this.replicaSet = in;
    return this;
  }

  private boolean connectToReplica;

  public boolean getConnectToReplica() {
    return this.connectToReplica;
  }

  public Mongo setConnectToReplica(boolean in) {
    this.connectToReplica = in;
    return this;
  }
}
