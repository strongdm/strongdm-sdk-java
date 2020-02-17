package com.strongdm.api.v1;

// RoleGrantGetResponse returns a requested RoleGrant.
public class RoleGrantGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public RoleGrantGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RoleGrant roleGrant;
  // The requested RoleGrant.
  public RoleGrant getRoleGrant() {
    return this.roleGrant;
  }
  // The requested RoleGrant.
  public RoleGrantGetResponse setRoleGrant(RoleGrant in) {
    this.roleGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public RoleGrantGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
