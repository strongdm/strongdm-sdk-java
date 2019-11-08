package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// CreateResponseMetadata
public class CreateResponseMetadata {

    private long affected;
    public long getAffected() {
        return this.affected;
    }
    public CreateResponseMetadata setAffected(long in) {
        this.affected = in;
        return this;
    }
}
