package com.strongdm.api.v1;

// A UserGrant connects a composite role to another role, granting members
// of the composite role the permissions granted to the attached role.
public class UserGrant {
  private String id;
  // Unique identifier of the UserGrant.
  // TODO: add strong ID
  public String getId() {
    return this.id;
  }
  // Unique identifier of the UserGrant.
  // TODO: add strong ID
  public UserGrant setId(String in) {
    this.id = in;
    return this;
  }

  private String resourceId;
  // The id of the composite role of this UserGrant.
  public String getResourceId() {
    return this.resourceId;
  }
  // The id of the composite role of this UserGrant.
  public UserGrant setResourceId(String in) {
    this.resourceId = in;
    return this;
  }

  private String userId;
  // The id of the attached role of this UserGrant.
  public String getUserId() {
    return this.userId;
  }
  // The id of the attached role of this UserGrant.
  public UserGrant setUserId(String in) {
    this.userId = in;
    return this;
  }
}
