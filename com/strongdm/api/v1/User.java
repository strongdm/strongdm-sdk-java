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
package com.strongdm.api.v1;

// A User can connect to resources they are granted directly, or granted
// via roles.
public class User implements Account {
  private String id;
  // Unique identifier of the User.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the User.
  public User setId(String in) {
    this.id = in;
    return this;
  }

  private String email;
  // The User's email address. Must be unique.
  public String getEmail() {
    return this.email;
  }
  // The User's email address. Must be unique.
  public User setEmail(String in) {
    this.email = in;
    return this;
  }

  private String firstName;
  // The User's first name.
  public String getFirstName() {
    return this.firstName;
  }
  // The User's first name.
  public User setFirstName(String in) {
    this.firstName = in;
    return this;
  }

  private String lastName;
  // The User's last name.
  public String getLastName() {
    return this.lastName;
  }
  // The User's last name.
  public User setLastName(String in) {
    this.lastName = in;
    return this;
  }
}
