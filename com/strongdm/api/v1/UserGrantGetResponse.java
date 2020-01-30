package com.strongdm.api.v1;

// UserGrantGetResponse returns a requested UserGrant.
public class UserGrantGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public UserGrantGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private UserGrant userGrant;
  // The requested UserGrant.
  public UserGrant getUserGrant() {
    return this.userGrant;
  }
  // The requested UserGrant.
  public UserGrantGetResponse setUserGrant(UserGrant in) {
    this.userGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public UserGrantGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
