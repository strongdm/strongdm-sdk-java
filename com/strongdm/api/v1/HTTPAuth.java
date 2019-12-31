package com.strongdm.api.v1;

public class HTTPAuth implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public HTTPAuth setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public HTTPAuth setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public HTTPAuth setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String url;

  public String getUrl() {
    return this.url;
  }

  public HTTPAuth setUrl(String in) {
    this.url = in;
    return this;
  }

  private String healthcheckPath;

  public String getHealthcheckPath() {
    return this.healthcheckPath;
  }

  public HTTPAuth setHealthcheckPath(String in) {
    this.healthcheckPath = in;
    return this;
  }

  private String authHeader;

  public String getAuthHeader() {
    return this.authHeader;
  }

  public HTTPAuth setAuthHeader(String in) {
    this.authHeader = in;
    return this;
  }

  private String headersBlacklist;

  public String getHeadersBlacklist() {
    return this.headersBlacklist;
  }

  public HTTPAuth setHeadersBlacklist(String in) {
    this.headersBlacklist = in;
    return this;
  }

  private String defaultPath;

  public String getDefaultPath() {
    return this.defaultPath;
  }

  public HTTPAuth setDefaultPath(String in) {
    this.defaultPath = in;
    return this;
  }

  private String subdomain;

  public String getSubdomain() {
    return this.subdomain;
  }

  public HTTPAuth setSubdomain(String in) {
    this.subdomain = in;
    return this;
  }
}
