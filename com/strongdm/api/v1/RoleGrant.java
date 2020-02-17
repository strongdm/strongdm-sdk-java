package com.strongdm.api.v1;

// A RoleGrant connects a resource to a role, granting members of the role
// access to it.
public class RoleGrant {
  private String id;
  // Unique identifier of the RoleGrant.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the RoleGrant.
  public RoleGrant setId(String in) {
    this.id = in;
    return this;
  }

  private String resourceId;
  // The id of the resource of this RoleGrant.
  public String getResourceId() {
    return this.resourceId;
  }
  // The id of the resource of this RoleGrant.
  public RoleGrant setResourceId(String in) {
    this.resourceId = in;
    return this;
  }

  private String roleId;
  // The id of the attached role of this RoleGrant.
  public String getRoleId() {
    return this.roleId;
  }
  // The id of the attached role of this RoleGrant.
  public RoleGrant setRoleId(String in) {
    this.roleId = in;
    return this;
  }
}
