package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeUpdateResponse returns the fields of a Node after it has been updated by
// a NodeUpdateRequest.
public class NodeUpdateResponse {
    private UpdateResponseMetadata meta;
    // Reserved for future use.
    public UpdateResponseMetadata getMeta() {
        return this.meta;
    }
    // Reserved for future use.
    public NodeUpdateResponse setMeta(UpdateResponseMetadata in) {
        this.meta = in;
        return this;
    }
    private Node node;
    // The updated Node.
    public Node getNode() {
        return this.node;
    }
    // The updated Node.
    public NodeUpdateResponse setNode(Node in) {
        this.node = in;
        return this;
    }
}
