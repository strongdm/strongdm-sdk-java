package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// BatchDeleteResponseMetadata
public class BatchDeleteResponseMetadata {

    private long found;
    public long getFound() {
        return this.found;
    }
    public BatchDeleteResponseMetadata setFound(long in) {
        this.found = in;
        return this;
    }

    private long affected;
    public long getAffected() {
        return this.affected;
    }
    public BatchDeleteResponseMetadata setAffected(long in) {
        this.affected = in;
        return this;
    }
}
