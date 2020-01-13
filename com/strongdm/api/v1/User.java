package com.strongdm.api.v1;

// A User can connect to resources they are granted directly, or granted
// via roles.

public class User implements Account {
  private String id;
  // Unique identifier of the User.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the User.
  public User setId(String in) {
    this.id = in;
    return this;
  }

  private String email;
  // The User's email address. Must be unique.
  public String getEmail() {
    return this.email;
  }
  // The User's email address. Must be unique.
  public User setEmail(String in) {
    this.email = in;
    return this;
  }

  private String firstName;
  // The User's first name.
  public String getFirstName() {
    return this.firstName;
  }
  // The User's first name.
  public User setFirstName(String in) {
    this.firstName = in;
    return this;
  }

  private String lastName;
  // The User's last name.
  public String getLastName() {
    return this.lastName;
  }
  // The User's last name.
  public User setLastName(String in) {
    this.lastName = in;
    return this;
  }
}
