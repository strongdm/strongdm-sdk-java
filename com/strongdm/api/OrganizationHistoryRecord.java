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
 * OrganizationHistoryRecord records the state of an Organization at a given point in time, where
 * every change to an Organization produces an OrganizationHistoryRecord.
 */
public class OrganizationHistoryRecord {
  private String activityId;
  /**
   * The unique identifier of the Activity that produced this change to the Organization. May be
   * empty for some system-initiated organization updates.
   */
  public String getActivityId() {
    return this.activityId;
  }
  /**
   * The unique identifier of the Activity that produced this change to the Organization. May be
   * empty for some system-initiated organization updates.
   */
  public void setActivityId(String in) {
    this.activityId = in;
  }

  private Organization organization;
  /** The complete Organization state at this time. */
  public Organization getOrganization() {
    return this.organization;
  }
  /** The complete Organization state at this time. */
  public void setOrganization(Organization in) {
    this.organization = in;
  }

  private Date timestamp;
  /** The time at which the Organization state was recorded. */
  public Date getTimestamp() {
    return this.timestamp;
  }
  /** The time at which the Organization state was recorded. */
  public void setTimestamp(Date in) {
    this.timestamp = in;
  }
}
