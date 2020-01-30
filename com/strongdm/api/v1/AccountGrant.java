package com.strongdm.api.v1;

// A AccountGrant connects a composite role to another role, granting members
// of the composite role the permissions granted to the attached role.
public class AccountGrant {
  private String id;
  // Unique identifier of the AccountGrant.
  // TODO: add strong ID
  public String getId() {
    return this.id;
  }
  // Unique identifier of the AccountGrant.
  // TODO: add strong ID
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
}
