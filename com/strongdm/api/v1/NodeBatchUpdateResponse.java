package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeBatchUpdateResponse returns a list of nodes updated via
// NodeBatchUpdateRequest.
public class NodeBatchUpdateResponse {

    private BatchUpdateResponseMetadata meta;
    public BatchUpdateResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeBatchUpdateResponse setMeta(BatchUpdateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private ArrayList<Node> nodes = new ArrayList<Node>();
    public List<Node> getNodes() {
        return this.nodes;
    }
    public Node getNodes(int index) {
        return this.nodes.get(index);
    }
    public int getNodesCount() {
        return this.nodes.size();
    }
    public NodeBatchUpdateResponse setNodes(int index, Node v) {
        this.nodes.set(index, v);
        return this;
    }
    public NodeBatchUpdateResponse removeNodes(int index) {
        this.nodes.remove(index);
        return this;
    }
    public NodeBatchUpdateResponse addNodes(Node v) {
        this.nodes.add(v);
        return this;
    }
    public NodeBatchUpdateResponse addAllNodes(Collection<Node> v) {
        this.nodes.addAll(v);
        return this;
    }
    public NodeBatchUpdateResponse setNodes(Collection<Node> in) {
        this.nodes = new ArrayList<>(in);
        return this;
    }
    public NodeBatchUpdateResponse clearNodes() {
        this.nodes.clear();
        return this;
    }
}
