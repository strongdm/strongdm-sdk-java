package com.strongdm.api.v1;

// ResourceDeleteResponse returns information about a Resource that was deleted.
public class ResourceDeleteResponse {
  private DeleteResponseMetadata meta;
  // Reserved for future use.
  public DeleteResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public ResourceDeleteResponse setMeta(DeleteResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public ResourceDeleteResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
