package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// RoleBatchDeleteResponse returns information about Roles deleted via a
// RoleBatchDeleteRequest.
public class RoleBatchDeleteResponse {

    private BatchDeleteResponseMetadata meta;
    public BatchDeleteResponseMetadata getMeta() {
        return this.meta;
    }
    public RoleBatchDeleteResponse setMeta(BatchDeleteResponseMetadata in) {
        this.meta = in;
        return this;
    }
}
