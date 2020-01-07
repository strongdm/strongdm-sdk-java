package com.strongdm.api.v1;

// RoleAttachmentDeleteResponse returns information about a RoleAttachment that was deleted.

public class RoleAttachmentDeleteResponse {
  private DeleteResponseMetadata meta;
  // Reserved for future use.
  public DeleteResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public RoleAttachmentDeleteResponse setMeta(DeleteResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public RoleAttachmentDeleteResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
