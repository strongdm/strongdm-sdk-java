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

public class KubernetesServiceAccount implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public KubernetesServiceAccount setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public KubernetesServiceAccount setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public KubernetesServiceAccount setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public KubernetesServiceAccount setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public KubernetesServiceAccount setPort(int in) {
    this.port = in;
    return this;
  }

  private String token;

  public String getToken() {
    return this.token;
  }

  public KubernetesServiceAccount setToken(String in) {
    this.token = in;
    return this;
  }
}
