package com.strongdm.api.v1;

// AccountCreateResponse reports how the Accounts were created in the system.
public class AccountCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Account account;
  // The created Account.
  public Account getAccount() {
    return this.account;
  }
  // The created Account.
  public AccountCreateResponse setAccount(Account in) {
    this.account = in;
    return this;
  }

  private String token;
  // The auth token generated for the Account. The Account will use this token to
  // authenticate with the strongDM API.
  public String getToken() {
    return this.token;
  }
  // The auth token generated for the Account. The Account will use this token to
  // authenticate with the strongDM API.
  public AccountCreateResponse setToken(String in) {
    this.token = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
