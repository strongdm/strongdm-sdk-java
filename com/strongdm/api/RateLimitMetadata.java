// Copyright 2020 StrongDM Inc
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// This file was generated by protogen. DO NOT EDIT.

package com.strongdm.api;

import java.util.Date;

/**
 * RateLimitMetadata contains information about remaining requests avaialable to the user over some
 * timeframe.
 */
public class RateLimitMetadata {
  private String bucket;
  /**
   * The bucket this user/token is associated with, which may be shared between multiple
   * users/tokens.
   */
  public String getBucket() {
    return this.bucket;
  }
  /**
   * The bucket this user/token is associated with, which may be shared between multiple
   * users/tokens.
   */
  public void setBucket(String in) {
    this.bucket = in;
  }

  private long limit;
  /** How many total requests the user/token is authorized to make before being rate limited. */
  public long getLimit() {
    return this.limit;
  }
  /** How many total requests the user/token is authorized to make before being rate limited. */
  public void setLimit(long in) {
    this.limit = in;
  }

  private long remaining;
  /** How many remaining requests out of the limit are still avaialable. */
  public long getRemaining() {
    return this.remaining;
  }
  /** How many remaining requests out of the limit are still avaialable. */
  public void setRemaining(long in) {
    this.remaining = in;
  }

  private Date resetAt;
  /** The time when remaining will be reset to limit. */
  public Date getResetAt() {
    return this.resetAt;
  }
  /** The time when remaining will be reset to limit. */
  public void setResetAt(Date in) {
    this.resetAt = in;
  }
}