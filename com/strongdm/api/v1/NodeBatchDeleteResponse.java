package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeBatchDeleteResponse returns information about nodes deleted via a
// NodeBatchDeleteRequest.
public class NodeBatchDeleteResponse {

    private BatchDeleteResponseMetadata meta;
    public BatchDeleteResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeBatchDeleteResponse setMeta(BatchDeleteResponseMetadata in) {
        this.meta = in;
        return this;
    }
}
