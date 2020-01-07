package com.strongdm.api.v1;

// ResourceCreateResponse reports how the Resources were created in the system.

public class ResourceCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public ResourceCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Resource resource;
  // The created Resource.
  public Resource getResource() {
    return this.resource;
  }
  // The created Resource.
  public ResourceCreateResponse setResource(Resource in) {
    this.resource = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public ResourceCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
