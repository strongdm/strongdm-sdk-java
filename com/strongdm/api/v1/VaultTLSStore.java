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

// This file was generated by protogen. DO NOT EDIT.

package com.strongdm.api.v1;

public class VaultTLSStore implements SecretStore {
  private String id;
  // Unique identifier of the SecretStore.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the SecretStore.
  public void setId(String in) {
    this.id = in;
  }

  private String name;
  // Unique human-readable name of the SecretStore.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the SecretStore.
  public void setName(String in) {
    this.name = in;
  }

  private String serverAddress;

  public String getServerAddress() {
    return this.serverAddress;
  }

  public void setServerAddress(String in) {
    this.serverAddress = in;
  }

  private String caCertPath;

  public String getCACertPath() {
    return this.caCertPath;
  }

  public void setCACertPath(String in) {
    this.caCertPath = in;
  }

  private String clientCertPath;

  public String getClientCertPath() {
    return this.clientCertPath;
  }

  public void setClientCertPath(String in) {
    this.clientCertPath = in;
  }

  private String clientKeyPath;

  public String getClientKeyPath() {
    return this.clientKeyPath;
  }

  public void setClientKeyPath(String in) {
    this.clientKeyPath = in;
  }

  private java.util.Map<String, String> tags;
  // Tags is a map of key, value pairs.
  public java.util.Map<String, String> getTags() {
    java.util.Map<String, String> m = new java.util.HashMap<String, String>();
    if (this.tags != null) {
      m.putAll(this.tags);
    }
    return m;
  }
  // Tags is a map of key, value pairs.
  public void setTags(java.util.Map<String, String> in) {
    if (in == null) {
      this.tags = null;
      return;
    }
    this.tags = new java.util.HashMap<String, String>();
    this.tags.putAll(in);
  }
}