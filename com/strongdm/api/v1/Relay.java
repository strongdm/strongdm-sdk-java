package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// Relay represents a StrongDM CLI installation running in relay mode.
public class Relay implements Node {
    private String id;
    // Unique identifier of the Relay.
    public String getId() {
        return this.id;
    }
    // Unique identifier of the Relay.
    public Relay setId(String in) {
        this.id = in;
        return this;
    }
    private String name;
    // Unique human-readable name of the Relay.
    public String getName() {
        return this.name;
    }
    // Unique human-readable name of the Relay.
    public Relay setName(String in) {
        this.name = in;
        return this;
    }
    private String state;
    // The current state of the relay. One of: "new", "verifying_restart",
    // "restarting", "started", "stopped", "dead", "unknown",
    public String getState() {
        return this.state;
    }
    // The current state of the relay. One of: "new", "verifying_restart",
    // "restarting", "started", "stopped", "dead", "unknown",
    public Relay setState(String in) {
        this.state = in;
        return this;
    }
}
