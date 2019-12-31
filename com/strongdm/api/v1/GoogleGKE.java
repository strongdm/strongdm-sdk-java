package com.strongdm.api.v1;

public class GoogleGKE implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public GoogleGKE setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public GoogleGKE setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public GoogleGKE setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String endpoint;

  public String getEndpoint() {
    return this.endpoint;
  }

  public GoogleGKE setEndpoint(String in) {
    this.endpoint = in;
    return this;
  }

  private String certificateAuthority;

  public String getCertificateAuthority() {
    return this.certificateAuthority;
  }

  public GoogleGKE setCertificateAuthority(String in) {
    this.certificateAuthority = in;
    return this;
  }

  private String serviceAccountKey;

  public String getServiceAccountKey() {
    return this.serviceAccountKey;
  }

  public GoogleGKE setServiceAccountKey(String in) {
    this.serviceAccountKey = in;
    return this;
  }
}
