package com.strongdm.api.v1;

// AccountGetResponse returns a requested Account.
public class AccountGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Account account;
  // The requested Account.
  public Account getAccount() {
    return this.account;
  }
  // The requested Account.
  public AccountGetResponse setAccount(Account in) {
    this.account = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
