package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// Token holds the bearer token used to start up nodes.
public class Token {

    private String id;
    public String getId() {
        return this.id;
    }
    public Token setId(String in) {
        this.id = in;
        return this;
    }

    private String token;
    public String getToken() {
        return this.token;
    }
    public Token setToken(String in) {
        this.token = in;
        return this;
    }
}
