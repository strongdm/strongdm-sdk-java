package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeGetResponse returns a requested node.
public class NodeGetResponse {

    private GetResponseMetadata meta;
    public GetResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeGetResponse setMeta(GetResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private Node node;
    public Node getNode() {
        return this.node;
    }
    public NodeGetResponse setNode(Node in) {
        this.node = in;
        return this;
    }
}
