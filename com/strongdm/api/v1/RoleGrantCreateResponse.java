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

// RoleGrantCreateResponse reports how the RoleGrants were created in the system.
public class RoleGrantCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public RoleGrantCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RoleGrant roleGrant;
  // The created RoleGrant.
  public RoleGrant getRoleGrant() {
    return this.roleGrant;
  }
  // The created RoleGrant.
  public RoleGrantCreateResponse setRoleGrant(RoleGrant in) {
    this.roleGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public RoleGrantCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}