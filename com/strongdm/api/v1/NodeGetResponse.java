package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeGetResponse returns a requested Node.
public class NodeGetResponse {
    private GetResponseMetadata meta;
    // Reserved for future use.
    public GetResponseMetadata getMeta() {
        return this.meta;
    }
    // Reserved for future use.
    public NodeGetResponse setMeta(GetResponseMetadata in) {
        this.meta = in;
        return this;
    }
    private Node node;
    // The requested Node.
    public Node getNode() {
        return this.node;
    }
    // The requested Node.
    public NodeGetResponse setNode(Node in) {
        this.node = in;
        return this;
    }
    private RateLimitMetadata rateLimit;
    // Rate limit information.
    public RateLimitMetadata getRateLimit() {
        return this.rateLimit;
    }
    // Rate limit information.
    public NodeGetResponse setRateLimit(RateLimitMetadata in) {
        this.rateLimit = in;
        return this;
    }
}
