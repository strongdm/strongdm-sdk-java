package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// Gateway represents a StrongDM CLI installation running in gateway mode.
public class Gateway implements Node {
    private String id;
    // Unique identifier of the Relay.
    public String getId() {
        return this.id;
    }
    // Unique identifier of the Relay.
    public Gateway setId(String in) {
        this.id = in;
        return this;
    }
    private String name;
    // Unique human-readable name of the Relay.
    public String getName() {
        return this.name;
    }
    // Unique human-readable name of the Relay.
    public Gateway setName(String in) {
        this.name = in;
        return this;
    }
    private String state;
    // The current state of the gateway. One of: "new", "verifying_restart",
    // "restarting", "started", "stopped", "dead", "unknown",
    public String getState() {
        return this.state;
    }
    // The current state of the gateway. One of: "new", "verifying_restart",
    // "restarting", "started", "stopped", "dead", "unknown",
    public Gateway setState(String in) {
        this.state = in;
        return this;
    }
    private String listenAddress;
    // The public hostname/port tuple at which the gateway will be accessible to clients.
    public String getListenAddress() {
        return this.listenAddress;
    }
    // The public hostname/port tuple at which the gateway will be accessible to clients.
    public Gateway setListenAddress(String in) {
        this.listenAddress = in;
        return this;
    }
    private String bindAddress;
    // The hostname/port tuple which the gateway daemon will bind to.
    public String getBindAddress() {
        return this.bindAddress;
    }
    // The hostname/port tuple which the gateway daemon will bind to.
    public Gateway setBindAddress(String in) {
        this.bindAddress = in;
        return this;
    }
}
