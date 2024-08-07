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

/** AccountAttachments assign an account to a role. */
public class AccountAttachment {
  private String accountId;
  /** The id of the account of this AccountAttachment. */
  public String getAccountId() {
    return this.accountId;
  }
  /** The id of the account of this AccountAttachment. */
  public void setAccountId(String in) {
    this.accountId = in;
  }

  private String id;
  /** Unique identifier of the AccountAttachment. */
  public String getId() {
    return this.id;
  }
  /** Unique identifier of the AccountAttachment. */
  public void setId(String in) {
    this.id = in;
  }

  private String roleId;
  /** The id of the attached role of this AccountAttachment. */
  public String getRoleId() {
    return this.roleId;
  }
  /** The id of the attached role of this AccountAttachment. */
  public void setRoleId(String in) {
    this.roleId = in;
  }
}
