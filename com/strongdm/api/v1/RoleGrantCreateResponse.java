package com.strongdm.api.v1;

// RoleGrantCreateResponse reports how the RoleGrants were created in the system.
public class RoleGrantCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public RoleGrantCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RoleGrant roleGrant;
  // The created RoleGrant.
  public RoleGrant getRoleGrant() {
    return this.roleGrant;
  }
  // The created RoleGrant.
  public RoleGrantCreateResponse setRoleGrant(RoleGrant in) {
    this.roleGrant = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public RoleGrantCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
