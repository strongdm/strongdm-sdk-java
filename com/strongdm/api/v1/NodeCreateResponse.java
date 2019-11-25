package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeCreateResponse reports how the nodes were created in the system. It can
// communicate partial successes or failures.
public class NodeCreateResponse {

    private CreateResponseMetadata meta;
    public CreateResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeCreateResponse setMeta(CreateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private Node node;
    public Node getNode() {
        return this.node;
    }
    public NodeCreateResponse setNode(Node in) {
        this.node = in;
        return this;
    }

    private String token;
    public String getToken() {
        return this.token;
    }
    public NodeCreateResponse setToken(String in) {
        this.token = in;
        return this;
    }
}
