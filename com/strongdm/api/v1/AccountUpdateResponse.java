package com.strongdm.api.v1;

// AccountUpdateResponse returns the fields of a Account after it has been updated by
// a AccountUpdateRequest.

public class AccountUpdateResponse {
  private UpdateResponseMetadata meta;
  // Reserved for future use.
  public UpdateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountUpdateResponse setMeta(UpdateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Account account;
  // The updated Account.
  public Account getAccount() {
    return this.account;
  }
  // The updated Account.
  public AccountUpdateResponse setAccount(Account in) {
    this.account = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountUpdateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
