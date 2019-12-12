package com.strongdm.api.v1;

public class RoleAttachment {
  private String id;
  // Unique identifier of the RoleAttachment.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the RoleAttachment.
  public RoleAttachment setId(String in) {
    this.id = in;
    return this;
  }

  private String compositeRoleId;

  public String getCompositeRoleId() {
    return this.compositeRoleId;
  }

  public RoleAttachment setCompositeRoleId(String in) {
    this.compositeRoleId = in;
    return this;
  }

  private String attachedRoleId;

  public String getAttachedRoleId() {
    return this.attachedRoleId;
  }

  public RoleAttachment setAttachedRoleId(String in) {
    this.attachedRoleId = in;
    return this;
  }
}
