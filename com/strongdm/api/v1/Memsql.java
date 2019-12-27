package com.strongdm.api.v1;

public class Memsql implements Driver {
  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public Memsql setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public Memsql setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public Memsql setPassword(String in) {
    this.password = in;
    return this;
  }

  private String database;

  public String getDatabase() {
    return this.database;
  }

  public Memsql setDatabase(String in) {
    this.database = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public Memsql setPort(int in) {
    this.port = in;
    return this;
  }
}
