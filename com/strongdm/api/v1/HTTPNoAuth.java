package com.strongdm.api.v1;

public class HTTPNoAuth implements Driver {
  private String url;

  public String getUrl() {
    return this.url;
  }

  public HTTPNoAuth setUrl(String in) {
    this.url = in;
    return this;
  }

  private String healthcheckPath;

  public String getHealthcheckPath() {
    return this.healthcheckPath;
  }

  public HTTPNoAuth setHealthcheckPath(String in) {
    this.healthcheckPath = in;
    return this;
  }

  private String headersBlacklist;

  public String getHeadersBlacklist() {
    return this.headersBlacklist;
  }

  public HTTPNoAuth setHeadersBlacklist(String in) {
    this.headersBlacklist = in;
    return this;
  }

  private String defaultPath;

  public String getDefaultPath() {
    return this.defaultPath;
  }

  public HTTPNoAuth setDefaultPath(String in) {
    this.defaultPath = in;
    return this;
  }

  private String subdomain;

  public String getSubdomain() {
    return this.subdomain;
  }

  public HTTPNoAuth setSubdomain(String in) {
    this.subdomain = in;
    return this;
  }
}
