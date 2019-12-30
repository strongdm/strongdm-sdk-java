package com.strongdm.api.v1;

public class GoogleGKE implements Driver {
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
