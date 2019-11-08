package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// UpdateResponseMetadata
public class UpdateResponseMetadata {

    private long affected;
    public long getAffected() {
        return this.affected;
    }
    public UpdateResponseMetadata setAffected(long in) {
        this.affected = in;
        return this;
    }
}
