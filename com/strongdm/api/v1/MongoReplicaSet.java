package com.strongdm.api.v1;

public class MongoReplicaSet implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public MongoReplicaSet setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public MongoReplicaSet setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public MongoReplicaSet setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public MongoReplicaSet setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String authDatabase;

  public String getAuthDatabase() {
    return this.authDatabase;
  }

  public MongoReplicaSet setAuthDatabase(String in) {
    this.authDatabase = in;
    return this;
  }

  private int portOverride;

  public int getPortOverride() {
    return this.portOverride;
  }

  public MongoReplicaSet setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public MongoReplicaSet setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public MongoReplicaSet setPassword(String in) {
    this.password = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public MongoReplicaSet setPort(int in) {
    this.port = in;
    return this;
  }

  private String replicaSet;

  public String getReplicaSet() {
    return this.replicaSet;
  }

  public MongoReplicaSet setReplicaSet(String in) {
    this.replicaSet = in;
    return this;
  }

  private boolean connectToReplica;

  public boolean getConnectToReplica() {
    return this.connectToReplica;
  }

  public MongoReplicaSet setConnectToReplica(boolean in) {
    this.connectToReplica = in;
    return this;
  }

  private boolean tlsRequired;

  public boolean getTlsRequired() {
    return this.tlsRequired;
  }

  public MongoReplicaSet setTlsRequired(boolean in) {
    this.tlsRequired = in;
    return this;
  }
}
