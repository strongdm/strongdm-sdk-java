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

import java.util.Date;

/**
 * PolicyHistory records the state of a Policy at a given point in time, where every change (create,
 * update and delete) to a Policy produces a PolicyHistory record.
 */
public class PolicyHistory {
  private String activityId;
  /**
   * The unique identifier of the Activity that produced this change to the Policy. May be empty for
   * some system-initiated updates.
   */
  public String getActivityId() {
    return this.activityId;
  }
  /**
   * The unique identifier of the Activity that produced this change to the Policy. May be empty for
   * some system-initiated updates.
   */
  public void setActivityId(String in) {
    this.activityId = in;
  }

  private Date deletedAt;
  /** If this Policy was deleted, the time it was deleted. */
  public Date getDeletedAt() {
    return this.deletedAt;
  }
  /** If this Policy was deleted, the time it was deleted. */
  public void setDeletedAt(Date in) {
    this.deletedAt = in;
  }

  private Policy policy;
  /** The complete Policy state at this time. */
  public Policy getPolicy() {
    return this.policy;
  }
  /** The complete Policy state at this time. */
  public void setPolicy(Policy in) {
    this.policy = in;
  }

  private Date timestamp;
  /** The time at which the Policy state was recorded. */
  public Date getTimestamp() {
    return this.timestamp;
  }
  /** The time at which the Policy state was recorded. */
  public void setTimestamp(Date in) {
    this.timestamp = in;
  }
}
