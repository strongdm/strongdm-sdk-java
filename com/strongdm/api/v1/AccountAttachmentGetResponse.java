package com.strongdm.api.v1;

// AccountAttachmentGetResponse returns a requested AccountAttachment.
public class AccountAttachmentGetResponse {
  private GetResponseMetadata meta;
  // Reserved for future use.
  public GetResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public AccountAttachmentGetResponse setMeta(GetResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private AccountAttachment accountAttachment;
  // The requested AccountAttachment.
  public AccountAttachment getAccountAttachment() {
    return this.accountAttachment;
  }
  // The requested AccountAttachment.
  public AccountAttachmentGetResponse setAccountAttachment(AccountAttachment in) {
    this.accountAttachment = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public AccountAttachmentGetResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
