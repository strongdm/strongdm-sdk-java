package com.strongdm.api.v1;

public class AmazonEKS implements Driver {
  private String endpoint;

  public String getEndpoint() {
    return this.endpoint;
  }

  public AmazonEKS setEndpoint(String in) {
    this.endpoint = in;
    return this;
  }

  private String accessKey;

  public String getAccessKey() {
    return this.accessKey;
  }

  public AmazonEKS setAccessKey(String in) {
    this.accessKey = in;
    return this;
  }

  private String secretAccessKey;

  public String getSecretAccessKey() {
    return this.secretAccessKey;
  }

  public AmazonEKS setSecretAccessKey(String in) {
    this.secretAccessKey = in;
    return this;
  }

  private String certificateAuthority;

  public String getCertificateAuthority() {
    return this.certificateAuthority;
  }

  public AmazonEKS setCertificateAuthority(String in) {
    this.certificateAuthority = in;
    return this;
  }

  private String region;

  public String getRegion() {
    return this.region;
  }

  public AmazonEKS setRegion(String in) {
    this.region = in;
    return this;
  }

  private String clusterName;

  public String getClusterName() {
    return this.clusterName;
  }

  public AmazonEKS setClusterName(String in) {
    this.clusterName = in;
    return this;
  }
}
