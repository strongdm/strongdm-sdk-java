package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// GetResponseMetadata
public class GetResponseMetadata {

    private long found;
    public long getFound() {
        return this.found;
    }
    public GetResponseMetadata setFound(long in) {
        this.found = in;
        return this;
    }
}
