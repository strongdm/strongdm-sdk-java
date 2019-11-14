package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleDeleteResponse returns information about a Role that was deleted.
public class RoleDeleteResponse {

    private DeleteResponseMetadata meta;
    public DeleteResponseMetadata getMeta() {
        return this.meta;
    }
    public RoleDeleteResponse setMeta(DeleteResponseMetadata in) {
        this.meta = in;
        return this;
    }
}
