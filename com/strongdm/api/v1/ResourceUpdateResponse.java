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
