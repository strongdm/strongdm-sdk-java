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

public class AKS implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public AKS setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public AKS setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public AKS setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public AKS setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public AKS setPort(int in) {
    this.port = in;
    return this;
  }

  private String certificateAuthority;

  public String getCertificateAuthority() {
    return this.certificateAuthority;
  }

  public AKS setCertificateAuthority(String in) {
    this.certificateAuthority = in;
    return this;
  }

  private String certificateAuthorityFilename;

  public String getCertificateAuthorityFilename() {
    return this.certificateAuthorityFilename;
  }

  public AKS setCertificateAuthorityFilename(String in) {
    this.certificateAuthorityFilename = in;
    return this;
  }

  private String clientCertificate;

  public String getClientCertificate() {
    return this.clientCertificate;
  }

  public AKS setClientCertificate(String in) {
    this.clientCertificate = in;
    return this;
  }

  private String clientCertificateFilename;

  public String getClientCertificateFilename() {
    return this.clientCertificateFilename;
  }

  public AKS setClientCertificateFilename(String in) {
    this.clientCertificateFilename = in;
    return this;
  }

  private String clientKey;

  public String getClientKey() {
    return this.clientKey;
  }

  public AKS setClientKey(String in) {
    this.clientKey = in;
    return this;
  }

  private String clientKeyFilename;

  public String getClientKeyFilename() {
    return this.clientKeyFilename;
  }

  public AKS setClientKeyFilename(String in) {
    this.clientKeyFilename = in;
    return this;
  }
}
