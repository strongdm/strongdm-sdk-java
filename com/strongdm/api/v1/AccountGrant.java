package com.strongdm.api.v1;

import java.util.Date;

// An AccountGrant connects an account to a resource, granting the account
// the ability to connect to that resource.
public class AccountGrant {
  private String id;
  // Unique identifier of the AccountGrant.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the AccountGrant.
  public AccountGrant setId(String in) {
    this.id = in;
    return this;
  }

  private String resourceId;
  // The id of the composite role of this AccountGrant.
  public String getResourceId() {
    return this.resourceId;
  }
  // The id of the composite role of this AccountGrant.
  public AccountGrant setResourceId(String in) {
    this.resourceId = in;
    return this;
  }

  private String accountId;
  // The id of the attached role of this AccountGrant.
  public String getAccountId() {
    return this.accountId;
  }
  // The id of the attached role of this AccountGrant.
  public AccountGrant setAccountId(String in) {
    this.accountId = in;
    return this;
  }

  private Date startFrom;
  // The timestamp when the resource will be granted. Optional. Both start_at
  // and end_at must be defined together, or not defined at all.
  public Date getStartFrom() {
    return this.startFrom;
  }
  // The timestamp when the resource will be granted. Optional. Both start_at
  // and end_at must be defined together, or not defined at all.
  public AccountGrant setStartFrom(Date in) {
    this.startFrom = in;
    return this;
  }

  private Date validUntil;
  // The timestamp when the resource grant will expire. Optional. Both
  // start_at and end_at must be defined together, or not defined at all.
  public Date getValidUntil() {
    return this.validUntil;
  }
  // The timestamp when the resource grant will expire. Optional. Both
  // start_at and end_at must be defined together, or not defined at all.
  public AccountGrant setValidUntil(Date in) {
    this.validUntil = in;
    return this;
  }
}
