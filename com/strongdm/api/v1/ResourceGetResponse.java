package com.strongdm.api.v1;

// ResourceGetResponse returns a requested Resource.
public class ResourceGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public ResourceGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Resource resource;
  // The requested Resource.
  public Resource getResource() {
    return this.resource;
  }
  // The requested Resource.
  public ResourceGetResponse setResource(Resource in) {
    this.resource = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public ResourceGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
