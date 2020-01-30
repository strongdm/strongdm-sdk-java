package com.strongdm.api.v1;

// AccountGrantDeleteResponse returns information about a AccountGrant that was deleted.
public class AccountGrantDeleteResponse {
  private DeleteResponseMetadata meta;
  // Reserved for future use.
  public DeleteResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountGrantDeleteResponse setMeta(DeleteResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountGrantDeleteResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
