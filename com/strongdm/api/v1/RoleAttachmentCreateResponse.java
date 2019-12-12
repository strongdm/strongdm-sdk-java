package com.strongdm.api.v1;

// RoleAttachmentCreateResponse reports how the RoleAttachments were created in the system.
public class RoleAttachmentCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public RoleAttachmentCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private RoleAttachment roleAttachment;
  // The created RoleAttachment.
  public RoleAttachment getRoleAttachment() {
    return this.roleAttachment;
  }
  // The created RoleAttachment.
  public RoleAttachmentCreateResponse setRoleAttachment(RoleAttachment in) {
    this.roleAttachment = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public RoleAttachmentCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
