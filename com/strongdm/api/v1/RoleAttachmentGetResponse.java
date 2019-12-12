package com.strongdm.api.v1;

// RoleAttachmentGetResponse returns a requested RoleAttachment.
public class RoleAttachmentGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public RoleAttachmentGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RoleAttachment roleAttachment;
  // The requested RoleAttachment.
  public RoleAttachment getRoleAttachment() {
    return this.roleAttachment;
  }
  // The requested RoleAttachment.
  public RoleAttachmentGetResponse setRoleAttachment(RoleAttachment in) {
    this.roleAttachment = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public RoleAttachmentGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
