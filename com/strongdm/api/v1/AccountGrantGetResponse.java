package com.strongdm.api.v1;

// AccountGrantGetResponse returns a requested AccountGrant.
public class AccountGrantGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountGrantGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private AccountGrant accountGrant;
  // The requested AccountGrant.
  public AccountGrant getAccountGrant() {
    return this.accountGrant;
  }
  // The requested AccountGrant.
  public AccountGrantGetResponse setAccountGrant(AccountGrant in) {
    this.accountGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountGrantGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
