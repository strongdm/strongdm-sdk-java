package com.strongdm.api.v1;

public class AmazonEKS implements Resource {
  private String id;
  // Unique identifier of the Resource.
  public String getId() {
    return this.id;
  }
  // Unique identifier of the Resource.
  public AmazonEKS setId(String in) {
    this.id = in;
    return this;
  }

  private String name;
  // Unique human-readable name of the Resource.
  public String getName() {
    return this.name;
  }
  // Unique human-readable name of the Resource.
  public AmazonEKS setName(String in) {
    this.name = in;
    return this;
  }

  private boolean healthy;
  // True if the datasource is reachable and the credentials are valid.
  public boolean getHealthy() {
    return this.healthy;
  }
  // True if the datasource is reachable and the credentials are valid.
  public AmazonEKS setHealthy(boolean in) {
    this.healthy = in;
    return this;
  }

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

  private String certificateAuthorityFilename;

  public String getCertificateAuthorityFilename() {
    return this.certificateAuthorityFilename;
  }

  public AmazonEKS setCertificateAuthorityFilename(String in) {
    this.certificateAuthorityFilename = in;
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
