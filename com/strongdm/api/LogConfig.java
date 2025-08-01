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

public class LogConfig {
  private java.util.Map<String, LogCategoryConfig> categories;
  /** The Organization's log category configuration settings. */
  public java.util.Map<String, LogCategoryConfig> getCategories() {
    return this.categories;
  }
  /** The Organization's log category configuration settings. */
  public void setCategories(java.util.Map<String, LogCategoryConfig> in) {
    this.categories = in;
  }

  private String localEncoder;
  /** The Organization's local log encryption encoder, one of the LogLocalEncoder constants. */
  public String getLocalEncoder() {
    return this.localEncoder;
  }
  /** The Organization's local log encryption encoder, one of the LogLocalEncoder constants. */
  public void setLocalEncoder(String in) {
    this.localEncoder = in;
  }

  private String localFormat;
  /** The Organization's local log format, one of the LogLocalFormat constants. */
  public String getLocalFormat() {
    return this.localFormat;
  }
  /** The Organization's local log format, one of the LogLocalFormat constants. */
  public void setLocalFormat(String in) {
    this.localFormat = in;
  }

  private String localSocketPath;
  /** The Organization's local log socket path. */
  public String getLocalSocketPath() {
    return this.localSocketPath;
  }
  /** The Organization's local log socket path. */
  public void setLocalSocketPath(String in) {
    this.localSocketPath = in;
  }

  private String localStorage;
  /** The Organization's local log storage, one of the LogLocalStorage constants. */
  public String getLocalStorage() {
    return this.localStorage;
  }
  /** The Organization's local log storage, one of the LogLocalStorage constants. */
  public void setLocalStorage(String in) {
    this.localStorage = in;
  }

  private String localTcpAddress;
  /** The Organization's local log TCP address. */
  public String getLocalTcpAddress() {
    return this.localTcpAddress;
  }
  /** The Organization's local log TCP address. */
  public void setLocalTcpAddress(String in) {
    this.localTcpAddress = in;
  }

  private String publicKey;
  /** The Organization's public key in PEM format for encrypting logs. */
  public String getPublicKey() {
    return this.publicKey;
  }
  /** The Organization's public key in PEM format for encrypting logs. */
  public void setPublicKey(String in) {
    this.publicKey = in;
  }
}
