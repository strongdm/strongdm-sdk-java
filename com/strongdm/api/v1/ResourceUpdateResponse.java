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

// ResourceUpdateResponse returns the fields of a Resource after it has been updated by
// a ResourceUpdateRequest.
public class ResourceUpdateResponse {
  private UpdateResponseMetadata meta;
  // Reserved for future use.
  public UpdateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public ResourceUpdateResponse setMeta(UpdateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Resource resource;
  // The updated Resource.
  public Resource getResource() {
    return this.resource;
  }
  // The updated Resource.
  public ResourceUpdateResponse setResource(Resource in) {
    this.resource = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public ResourceUpdateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
