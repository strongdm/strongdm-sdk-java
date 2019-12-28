package com.strongdm.api.v1;

public class Kubernetes implements Driver {
  private String hostname;

  public String getHostname() {
    return this.hostname;
  }

  public Kubernetes setHostname(String in) {
    this.hostname = in;
    return this;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  public Kubernetes setPort(int in) {
    this.port = in;
    return this;
  }

  private String certificateAuthority;

  public String getCertificateAuthority() {
    return this.certificateAuthority;
  }

  public Kubernetes setCertificateAuthority(String in) {
    this.certificateAuthority = in;
    return this;
  }

  private String clientCertificate;

  public String getClientCertificate() {
    return this.clientCertificate;
  }

  public Kubernetes setClientCertificate(String in) {
    this.clientCertificate = in;
    return this;
  }

  private String clientKey;

  public String getClientKey() {
    return this.clientKey;
  }

  public Kubernetes setClientKey(String in) {
    this.clientKey = in;
    return this;
  }
}
