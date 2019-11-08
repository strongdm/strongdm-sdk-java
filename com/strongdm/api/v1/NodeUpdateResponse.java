package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeUpdateResponse returns the fields of a node after it has been updated by
// a NodeUpdateRequest.
public class NodeUpdateResponse {

    private UpdateResponseMetadata meta;
    public UpdateResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeUpdateResponse setMeta(UpdateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private Node node;
    public Node getNode() {
        return this.node;
    }
    public NodeUpdateResponse setNode(Node in) {
        this.node = in;
        return this;
    }
}
