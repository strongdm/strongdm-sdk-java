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

// A Role grants users access to a set of resources. Composite roles have no
// resource associations of their own, but instead grant access to the combined
// resources of their child roles.
public class Role {
  private String id;
  // Unique identifier of the Role.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Role.
  public Role setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Role.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Role.
  public Role setName(String in) {
    this.name = in;
    return this;
  }

  private boolean composite;
  // True if the Role is a composite role.
  public boolean getComposite() {
    return this.composite;
  }
  // True if the Role is a composite role.
  public Role setComposite(boolean in) {
    this.composite = in;
    return this;
  }
}
