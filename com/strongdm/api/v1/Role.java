package com.strongdm.api.v1;

// A Role grants users access to a set of resources. Composite roles have no
// resource associations of their own, but instead grant access to the combined
// resources of their child roles.
public class Role {
  private String id;
  // Unique identifier of the Role.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Role.
  public Role setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Role.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Role.
  public Role setName(String in) {
    this.name = in;
    return this;
  }

  private boolean composite;
  // True if the Role is a composite role.
  public boolean getComposite() {
    return this.composite;
  }
  // True if the Role is a composite role.
  public Role setComposite(boolean in) {
    this.composite = in;
    return this;
  }
}
