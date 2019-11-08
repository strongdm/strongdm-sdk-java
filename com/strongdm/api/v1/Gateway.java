package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// Gateway represents a StrongDM CLI installation running in gateway mode.
public class Gateway implements Node {

    private String id;
    public String getId() {
        return this.id;
    }
    public Gateway setId(String in) {
        this.id = in;
        return this;
    }

    private String name;
    public String getName() {
        return this.name;
    }
    public Gateway setName(String in) {
        this.name = in;
        return this;
    }

    private String listenAddress;
    public String getListenAddress() {
        return this.listenAddress;
    }
    public Gateway setListenAddress(String in) {
        this.listenAddress = in;
        return this;
    }

    private String bindAddress;
    public String getBindAddress() {
        return this.bindAddress;
    }
    public Gateway setBindAddress(String in) {
        this.bindAddress = in;
        return this;
    }
}
