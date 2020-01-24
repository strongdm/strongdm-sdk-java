package com.strongdm.api.v1;

// AccountDeleteResponse returns information about a Account that was deleted.
public class AccountDeleteResponse {
  private DeleteResponseMetadata meta;
  // Reserved for future use.
  public DeleteResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountDeleteResponse setMeta(DeleteResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountDeleteResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
