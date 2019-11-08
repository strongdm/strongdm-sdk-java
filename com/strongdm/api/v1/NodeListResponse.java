package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeListResponse returns a list of nodes that meet the criteria of a
// NodeListRequest.
public class NodeListResponse {

	private Iterable<Node> nodes;
    public Iterable<Node> getNodes() {
        return this.nodes;
    }
    public NodeListResponse setNodes(Iterable<Node> in) {
        this.nodes = in;
        return this;
    }
}
