package com.strongdm.api.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// NodeCreateResponse reports how the nodes were created in the system. It can
// communicate partial successes or failures.
public class NodeCreateResponse {

    private CreateResponseMetadata meta;
    public CreateResponseMetadata getMeta() {
        return this.meta;
    }
    public NodeCreateResponse setMeta(CreateResponseMetadata in) {
        this.meta = in;
        return this;
    }

    private ArrayList<Node> nodes = new ArrayList<Node>();
    public List<Node> getNodes() {
        return this.nodes;
    }
    public Node getNodes(int index) {
        return this.nodes.get(index);
    }
    public int getNodesCount() {
        return this.nodes.size();
    }
    public NodeCreateResponse setNodes(int index, Node v) {
        this.nodes.set(index, v);
        return this;
    }
    public NodeCreateResponse removeNodes(int index) {
        this.nodes.remove(index);
        return this;
    }
    public NodeCreateResponse addNodes(Node v) {
        this.nodes.add(v);
        return this;
    }
    public NodeCreateResponse addAllNodes(Collection<Node> v) {
        this.nodes.addAll(v);
        return this;
    }
    public NodeCreateResponse setNodes(Collection<Node> in) {
        this.nodes = new ArrayList<>(in);
        return this;
    }
    public NodeCreateResponse clearNodes() {
        this.nodes.clear();
        return this;
    }

    private ArrayList<Token> tokens = new ArrayList<Token>();
    public List<Token> getTokens() {
        return this.tokens;
    }
    public Token getTokens(int index) {
        return this.tokens.get(index);
    }
    public int getTokensCount() {
        return this.tokens.size();
    }
    public NodeCreateResponse setTokens(int index, Token v) {
        this.tokens.set(index, v);
        return this;
    }
    public NodeCreateResponse removeTokens(int index) {
        this.tokens.remove(index);
        return this;
    }
    public NodeCreateResponse addTokens(Token v) {
        this.tokens.add(v);
        return this;
    }
    public NodeCreateResponse addAllTokens(Collection<Token> v) {
        this.tokens.addAll(v);
        return this;
    }
    public NodeCreateResponse setTokens(Collection<Token> in) {
        this.tokens = new ArrayList<>(in);
        return this;
    }
    public NodeCreateResponse clearTokens() {
        this.tokens.clear();
        return this;
    }
}
