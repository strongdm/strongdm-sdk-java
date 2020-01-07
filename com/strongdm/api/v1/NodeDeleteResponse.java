package com.strongdm.api.v1;

// NodeDeleteResponse returns information about a Node that was deleted.

public class NodeDeleteResponse {
  private DeleteResponseMetadata meta;
  // Reserved for future use.
  public DeleteResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public NodeDeleteResponse setMeta(DeleteResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public NodeDeleteResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
