package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// DeleteResponseMetadata
public class DeleteResponseMetadata {

    private long affected;
    public long getAffected() {
        return this.affected;
    }
    public DeleteResponseMetadata setAffected(long in) {
        this.affected = in;
        return this;
    }
}
