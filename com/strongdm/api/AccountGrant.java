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

package com.strongdm.api;

import java.util.Date;

/**
 * AccountGrants connect a resource directly to an account, giving the account the permission to
 * connect to that resource.
 */
public class AccountGrant {
  private String accountId;
  /** The account ID of this AccountGrant. */
  public String getAccountId() {
    return this.accountId;
  }
  /** The account ID of this AccountGrant. */
  public void setAccountId(String in) {
    this.accountId = in;
  }

  private String id;
  /** Unique identifier of the AccountGrant. */
  public String getId() {
    return this.id;
  }
  /** Unique identifier of the AccountGrant. */
  public void setId(String in) {
    this.id = in;
  }

  private String resourceId;
  /** The resource ID of this AccountGrant. */
  public String getResourceId() {
    return this.resourceId;
  }
  /** The resource ID of this AccountGrant. */
  public void setResourceId(String in) {
    this.resourceId = in;
  }

  private Date startFrom;
  /**
   * The timestamp when the resource will be granted. When creating an AccountGrant, if this field
   * is not specified, it will default to the current time.
   */
  public Date getStartFrom() {
    return this.startFrom;
  }
  /**
   * The timestamp when the resource will be granted. When creating an AccountGrant, if this field
   * is not specified, it will default to the current time.
   */
  public void setStartFrom(Date in) {
    this.startFrom = in;
  }

  private Date validUntil;
  /** The timestamp when the resource grant will expire. */
  public Date getValidUntil() {
    return this.validUntil;
  }
  /** The timestamp when the resource grant will expire. */
  public void setValidUntil(Date in) {
    this.validUntil = in;
  }
}