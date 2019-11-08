package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeDeleteResponse returns information about a node that was deleted.
public class NodeDeleteResponse {

    private DeleteResponseMetadata meta;
    public DeleteResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeDeleteResponse setMeta(DeleteResponseMetadata in) {
        this.meta = in;
        return this;
    }
}
