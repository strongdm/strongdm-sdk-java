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

// Code generated by protogen. DO NOT EDIT.

package com.strongdm.api;

/**
 * VaultTokenCertSSHStore is currently unstable, and its API may change, or it may be removed,
 * without a major version bump.
 */
public class VaultTokenCertSSHStore implements SecretStore {
  private String id;
  /** Unique identifier of the SecretStore. */
  public String getId() {
    return this.id;
  }
  /** Unique identifier of the SecretStore. */
  public void setId(String in) {
    this.id = in;
  }

  private String name;
  /** Unique human-readable name of the SecretStore. */
  public String getName() {
    return this.name;
  }
  /** Unique human-readable name of the SecretStore. */
  public void setName(String in) {
    this.name = in;
  }

  private String namespace;
  /** The namespace to make requests within */
  public String getNamespace() {
    return this.namespace;
  }
  /** The namespace to make requests within */
  public void setNamespace(String in) {
    this.namespace = in;
  }

  private String serverAddress;
  /** The URL of the Vault to target */
  public String getServerAddress() {
    return this.serverAddress;
  }
  /** The URL of the Vault to target */
  public void setServerAddress(String in) {
    this.serverAddress = in;
  }

  private String signingRole;
  /** The signing role to be used for signing certificates */
  public String getSigningRole() {
    return this.signingRole;
  }
  /** The signing role to be used for signing certificates */
  public void setSigningRole(String in) {
    this.signingRole = in;
  }

  private String sshMountPoint;
  /** The mount point of the SSH engine configured with the desired CA */
  public String getSshMountPoint() {
    return this.sshMountPoint;
  }
  /** The mount point of the SSH engine configured with the desired CA */
  public void setSshMountPoint(String in) {
    this.sshMountPoint = in;
  }

  private java.util.Map<String, String> tags;
  /** Tags is a map of key, value pairs. */
  public java.util.Map<String, String> getTags() {
    java.util.Map<String, String> m = new java.util.HashMap<String, String>();
    if (this.tags != null) {
      m.putAll(this.tags);
    }
    return m;
  }
  /** Tags is a map of key, value pairs. */
  public void setTags(java.util.Map<String, String> in) {
    if (in == null) {
      this.tags = null;
      return;
    }
    this.tags = new java.util.HashMap<String, String>();
    this.tags.putAll(in);
  }
}