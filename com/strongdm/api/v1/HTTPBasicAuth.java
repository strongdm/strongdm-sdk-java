package com.strongdm.api.v1;

public class HTTPBasicAuth implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public HTTPBasicAuth setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public HTTPBasicAuth setName(String in) {
    this.name = in;
    return this;
  }

  private int portOverride;
  // Port number override.
  public int getPortOverride() {
    return this.portOverride;
  }
  // Port number override.
  public HTTPBasicAuth setPortOverride(int in) {
    this.portOverride = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public HTTPBasicAuth setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String url;

  public String getUrl() {
    return this.url;
  }

  public HTTPBasicAuth setUrl(String in) {
    this.url = in;
    return this;
  }

  private String healthcheckPath;

  public String getHealthcheckPath() {
    return this.healthcheckPath;
  }

  public HTTPBasicAuth setHealthcheckPath(String in) {
    this.healthcheckPath = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public HTTPBasicAuth setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public HTTPBasicAuth setPassword(String in) {
    this.password = in;
    return this;
  }

  private String headersBlacklist;

  public String getHeadersBlacklist() {
    return this.headersBlacklist;
  }

  public HTTPBasicAuth setHeadersBlacklist(String in) {
    this.headersBlacklist = in;
    return this;
  }

  private String defaultPath;

  public String getDefaultPath() {
    return this.defaultPath;
  }

  public HTTPBasicAuth setDefaultPath(String in) {
    this.defaultPath = in;
    return this;
  }

  private String subdomain;

  public String getSubdomain() {
    return this.subdomain;
  }

  public HTTPBasicAuth setSubdomain(String in) {
    this.subdomain = in;
    return this;
  }
}
