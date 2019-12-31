package com.strongdm.api.v1;

public class KubernetesBasicAuth implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public KubernetesBasicAuth setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public KubernetesBasicAuth setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public KubernetesBasicAuth setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public KubernetesBasicAuth setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public KubernetesBasicAuth setPort(int in) {
    this.port = in;
    return this;
  }

  private String username;

  public String getUsername() {
    return this.username;
  }

  public KubernetesBasicAuth setUsername(String in) {
    this.username = in;
    return this;
  }

  private String password;

  public String getPassword() {
    return this.password;
  }

  public KubernetesBasicAuth setPassword(String in) {
    this.password = in;
    return this;
  }

  private String certificateAuthority;

  public String getCertificateAuthority() {
    return this.certificateAuthority;
  }

  public KubernetesBasicAuth setCertificateAuthority(String in) {
    this.certificateAuthority = in;
    return this;
  }

  private String clientCertificate;

  public String getClientCertificate() {
    return this.clientCertificate;
  }

  public KubernetesBasicAuth setClientCertificate(String in) {
    this.clientCertificate = in;
    return this;
  }

  private String clientKey;

  public String getClientKey() {
    return this.clientKey;
  }

  public KubernetesBasicAuth setClientKey(String in) {
    this.clientKey = in;
    return this;
  }
}
