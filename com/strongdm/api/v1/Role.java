package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// A Role grants users access to a set of resources. Composite roles have no
// resource associations of their own, but instead grant access to the combined
// resources of their child roles.
public class Role {
    // Unique identifier of the role.
    private String id;
    public String getId() {
        return this.id;
    }
    public Role setId(String in) {
        this.id = in;
        return this;
    }
    // Unique human-readable name of the role.
    private String name;
    public String getName() {
        return this.name;
    }
    public Role setName(String in) {
        this.name = in;
        return this;
    }
    // True if the role is a composite role.
    private boolean composite;
    public boolean getComposite() {
        return this.composite;
    }
    public Role setComposite(boolean in) {
        this.composite = in;
        return this;
    }
}
