package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// Role is a domain object --
public class Role {

    private String id;
    public String getId() {
        return this.id;
    }
    public Role setId(String in) {
        this.id = in;
        return this;
    }

    private String name;
    public String getName() {
        return this.name;
    }
    public Role setName(String in) {
        this.name = in;
        return this;
    }

    private boolean composite;
    public boolean getComposite() {
        return this.composite;
    }
    public Role setComposite(boolean in) {
        this.composite = in;
        return this;
    }

    private ArrayList<Role> roles = new ArrayList<Role>();
    public List<Role> getRoles() {
        return this.roles;
    }
    public Role getRoles(int index) {
        return this.roles.get(index);
    }
    public int getRolesCount() {
        return this.roles.size();
    }
    public Role setRoles(int index, Role v) {
        this.roles.set(index, v);
        return this;
    }
    public Role removeRoles(int index) {
        this.roles.remove(index);
        return this;
    }
    public Role addRoles(Role v) {
        this.roles.add(v);
        return this;
    }
    public Role addAllRoles(Collection<Role> v) {
        this.roles.addAll(v);
        return this;
    }
    public Role setRoles(Collection<Role> in) {
        this.roles = new ArrayList<>(in);
        return this;
    }
    public Role clearRoles() {
        this.roles.clear();
        return this;
    }
}
