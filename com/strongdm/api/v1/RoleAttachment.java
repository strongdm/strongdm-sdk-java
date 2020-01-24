package com.strongdm.api.v1;

// A RoleAttachment connects a composite role to another role, granting members
// of the composite role the permissions granted to the attached role.
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
  // The id of the composite role of this RoleAttachment.
  public String getCompositeRoleId() {
    return this.compositeRoleId;
  }
  // The id of the composite role of this RoleAttachment.
  public RoleAttachment setCompositeRoleId(String in) {
    this.compositeRoleId = in;
    return this;
  }

  private String attachedRoleId;
  // The id of the attached role of this RoleAttachment.
  public String getAttachedRoleId() {
    return this.attachedRoleId;
  }
  // The id of the attached role of this RoleAttachment.
  public RoleAttachment setAttachedRoleId(String in) {
    this.attachedRoleId = in;
    return this;
  }
}
