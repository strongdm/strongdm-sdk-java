package com.strongdm.api.v1;

// A AccountAttachment connects an account to a role, granting the account
// the permissions granted to that role.
public class AccountAttachment {
  private String id;
  // Unique identifier of the AccountAttachment.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the AccountAttachment.
  public AccountAttachment setId(String in) {
    this.id = in;
    return this;
  }

  private String accountId;
  // The id of the account of this AccountAttachment.
  public String getAccountId() {
    return this.accountId;
  }
  // The id of the account of this AccountAttachment.
  public AccountAttachment setAccountId(String in) {
    this.accountId = in;
    return this;
  }

  private String roleId;
  // The id of the attached role of this AccountAttachment.
  public String getRoleId() {
    return this.roleId;
  }
  // The id of the attached role of this AccountAttachment.
  public AccountAttachment setRoleId(String in) {
    this.roleId = in;
    return this;
  }
}
