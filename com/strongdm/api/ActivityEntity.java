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

public class ActivityEntity {
  private String email;
  /** The email of the affected entity, if it has one (for example, if it is an account). */
  public String getEmail() {
    return this.email;
  }
  /** The email of the affected entity, if it has one (for example, if it is an account). */
  public void setEmail(String in) {
    this.email = in;
  }

  private String externalId;
  /** The external ID of the affected entity, if it has one (for example, if it is an account). */
  public String getExternalId() {
    return this.externalId;
  }
  /** The external ID of the affected entity, if it has one (for example, if it is an account). */
  public void setExternalId(String in) {
    this.externalId = in;
  }

  private String id;
  /** The unique identifier of the entity this activity affected. */
  public String getId() {
    return this.id;
  }
  /** The unique identifier of the entity this activity affected. */
  public void setId(String in) {
    this.id = in;
  }

  private String name;
  /** A display name representing the affected entity. */
  public String getName() {
    return this.name;
  }
  /** A display name representing the affected entity. */
  public void setName(String in) {
    this.name = in;
  }

  private String type;
  /** The type of entity affected, one of the Activity Entities constants. */
  public String getType() {
    return this.type;
  }
  /** The type of entity affected, one of the Activity Entities constants. */
  public void setType(String in) {
    this.type = in;
  }
}