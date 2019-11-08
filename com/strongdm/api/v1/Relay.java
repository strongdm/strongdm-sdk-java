package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// Relay represents a StrongDM CLI installation running in relay mode.
public class Relay implements Node {

    private String id;
    public String getId() {
        return this.id;
    }
    public Relay setId(String in) {
        this.id = in;
        return this;
    }

    private String name;
    public String getName() {
        return this.name;
    }
    public Relay setName(String in) {
        this.name = in;
        return this;
    }
}
