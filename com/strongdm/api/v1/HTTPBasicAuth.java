package com.strongdm.api.v1;

public class HTTPBasicAuth implements Driver {
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
