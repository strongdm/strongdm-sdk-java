package com.strongdm.api.v1;

// UserGrantCreateResponse reports how the UserGrants were created in the system.
public class UserGrantCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public UserGrantCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private UserGrant userGrant;
  // The created UserGrant.
  public UserGrant getUserGrant() {
    return this.userGrant;
  }
  // The created UserGrant.
  public UserGrantCreateResponse setUserGrant(UserGrant in) {
    this.userGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public UserGrantCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
