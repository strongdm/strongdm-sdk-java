// Copyright 2020 StrongDM Inc
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
package com.strongdm.api.v1;

public class HTTPNoAuth implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public HTTPNoAuth setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public HTTPNoAuth setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public HTTPNoAuth setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

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
