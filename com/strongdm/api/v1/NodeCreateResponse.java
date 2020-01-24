package com.strongdm.api.v1;

// NodeCreateResponse reports how the Nodes were created in the system.
public class NodeCreateResponse {
  private CreateResponseMetadata meta;
  // Reserved for future use.
  public CreateResponseMetadata getMeta() {
    return this.meta;
  }
  // Reserved for future use.
  public NodeCreateResponse setMeta(CreateResponseMetadata in) {
    this.meta = in;
    return this;
  }

  private Node node;
  // The created Node.
  public Node getNode() {
    return this.node;
  }
  // The created Node.
  public NodeCreateResponse setNode(Node in) {
    this.node = in;
    return this;
  }

  private String token;
  // The auth token generated for the Node. The Node will use this token to
  // authenticate with the strongDM API.
  public String getToken() {
    return this.token;
  }
  // The auth token generated for the Node. The Node will use this token to
  // authenticate with the strongDM API.
  public NodeCreateResponse setToken(String in) {
    this.token = in;
    return this;
  }

  private RateLimitMetadata rateLimit;
  // Rate limit information.
  public RateLimitMetadata getRateLimit() {
    return this.rateLimit;
  }
  // Rate limit information.
  public NodeCreateResponse setRateLimit(RateLimitMetadata in) {
    this.rateLimit = in;
    return this;
  }
}
