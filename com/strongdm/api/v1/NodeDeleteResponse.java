package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeDeleteResponse returns information about a Node that was deleted.
public class NodeDeleteResponse {
    private DeleteResponseMetadata meta;
    // Reserved for future use.
    public DeleteResponseMetadata getMeta() {
        return this.meta;
    }
    // Reserved for future use.
    public NodeDeleteResponse setMeta(DeleteResponseMetadata in) {
        this.meta = in;
        return this;
    }
}
