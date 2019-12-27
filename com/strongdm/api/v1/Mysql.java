package com.strongdm.api.v1;

public class Mysql implements Driver {
  private String username;

  public String getUsername() {
    return this.username;
  }

  public Mysql setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public Mysql setPassword(String in) {
    this.password = in;
    return this;
  }

  private String database;

  public String getDatabase() {
    return this.database;
  }

  public Mysql setDatabase(String in) {
    this.database = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public Mysql setPort(int in) {
    this.port = in;
    return this;
  }
}
