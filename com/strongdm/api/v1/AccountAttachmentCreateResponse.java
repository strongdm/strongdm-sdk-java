package com.strongdm.api.v1;

// AccountAttachmentCreateResponse reports how the AccountAttachments were created in the system.
public class AccountAttachmentCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountAttachmentCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private AccountAttachment accountAttachment;
  // The created AccountAttachment.
  public AccountAttachment getAccountAttachment() {
    return this.accountAttachment;
  }
  // The created AccountAttachment.
  public AccountAttachmentCreateResponse setAccountAttachment(AccountAttachment in) {
    this.accountAttachment = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountAttachmentCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
