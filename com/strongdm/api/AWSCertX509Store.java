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
 * AWSCertX509Store is currently unstable, and its API may change, or it may be removed, without a
 * major version bump.
 */
public class AWSCertX509Store implements SecretStore {
  private String caArn;
  /** The ARN of the CA in AWS Private CA */
  public String getCaArn() {
    return this.caArn;
  }
  /** The ARN of the CA in AWS Private CA */
  public void setCaArn(String in) {
    this.caArn = in;
  }

  private String certificateTemplateArn;
  /**
   * The ARN of the AWS certificate template for requested certificates. Must allow SAN, key usage,
   * and ext key usage passthrough from CSR
   */
  public String getCertificateTemplateArn() {
    return this.certificateTemplateArn;
  }
  /**
   * The ARN of the AWS certificate template for requested certificates. Must allow SAN, key usage,
   * and ext key usage passthrough from CSR
   */
  public void setCertificateTemplateArn(String in) {
    this.certificateTemplateArn = in;
  }

  private String id;
  /** Unique identifier of the SecretStore. */
  public String getId() {
    return this.id;
  }
  /** Unique identifier of the SecretStore. */
  public void setId(String in) {
    this.id = in;
  }

  private String issuedCertTtlMinutes;
  /**
   * The lifetime of certificates issued by this CA represented in minutes e.g. 600 (for 10 hours).
   * Defaults to 8 hours if not provided.
   */
  public String getIssuedCertTTLMinutes() {
    return this.issuedCertTtlMinutes;
  }
  /**
   * The lifetime of certificates issued by this CA represented in minutes e.g. 600 (for 10 hours).
   * Defaults to 8 hours if not provided.
   */
  public void setIssuedCertTTLMinutes(String in) {
    this.issuedCertTtlMinutes = in;
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

  private String region;
  /** The AWS region to target e.g. us-east-1 */
  public String getRegion() {
    return this.region;
  }
  /** The AWS region to target e.g. us-east-1 */
  public void setRegion(String in) {
    this.region = in;
  }

  private String signingAlgo;
  /**
   * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
   * CA's secret key. e.g. SHA256WITHRSA
   */
  public String getSigningAlgo() {
    return this.signingAlgo;
  }
  /**
   * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
   * CA's secret key. e.g. SHA256WITHRSA
   */
  public void setSigningAlgo(String in) {
    this.signingAlgo = in;
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