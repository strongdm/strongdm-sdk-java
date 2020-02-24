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

// A Service is a service account that can connect to resources they are granted
// directly, or granted via roles. Services are typically automated jobs.
public class Service implements Account {
  private String id;
  // Unique identifier of the Service.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Service.
  public Service setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Service.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Service.
  public Service setName(String in) {
    this.name = in;
    return this;
  }
}
