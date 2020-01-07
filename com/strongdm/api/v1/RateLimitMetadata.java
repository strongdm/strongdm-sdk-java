package com.strongdm.api.v1;

import java.util.Date;

// RateLimitMetadata contains information about remaining requests avaialable
// to the user over some timeframe.

public class RateLimitMetadata {
  private long limit;
  // How many total requests the user/token is authorized to make before being
  // rate limited.
  public long getLimit() {
    return this.limit;
  }
  // How many total requests the user/token is authorized to make before being
  // rate limited.
  public RateLimitMetadata setLimit(long in) {
    this.limit = in;
    return this;
  }

  private long remaining;
  // How many remaining requests out of the limit are still avaialable.
  public long getRemaining() {
    return this.remaining;
  }
  // How many remaining requests out of the limit are still avaialable.
  public RateLimitMetadata setRemaining(long in) {
    this.remaining = in;
    return this;
  }

  private Date resetAt;
  // The time when remaining will be reset to limit.
  public Date getResetAt() {
    return this.resetAt;
  }
  // The time when remaining will be reset to limit.
  public RateLimitMetadata setResetAt(Date in) {
    this.resetAt = in;
    return this;
  }

  private String bucket;
  // The bucket this user/token is associated with, which may be shared between
  // multiple users/tokens.
  public String getBucket() {
    return this.bucket;
  }
  // The bucket this user/token is associated with, which may be shared between
  // multiple users/tokens.
  public RateLimitMetadata setBucket(String in) {
    this.bucket = in;
    return this;
  }
}
