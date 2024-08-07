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
 * ApprovalWorkflowApproverDeleteResponse returns information about an ApprovalWorkflowApprover that
 * was deleted.
 */
public class ApprovalWorkflowApproverDeleteResponse {
  private String id;
  /** The deleted approval workflow approver id. */
  public String getId() {
    return this.id;
  }
  /** The deleted approval workflow approver id. */
  public void setId(String in) {
    this.id = in;
  }

  private RateLimitMetadata rateLimit;
  /** Rate limit information. */
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  /** Rate limit information. */
  public void setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
  }
}
