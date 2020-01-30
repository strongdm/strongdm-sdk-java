package com.strongdm.api.v1;

// AccountGrantCreateResponse reports how the AccountGrants were created in the system.
public class AccountGrantCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountGrantCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private AccountGrant accountGrant;
  // The created AccountGrant.
  public AccountGrant getAccountGrant() {
    return this.accountGrant;
  }
  // The created AccountGrant.
  public AccountGrantCreateResponse setAccountGrant(AccountGrant in) {
    this.accountGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountGrantCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
