package com.strongdm.api.v1;

// A Node is a proxy in the strongDM network. They come in two flavors: relays,
// which communicate with resources, and gateways, which communicate with
// clients.
public interface Node {

  // Returns the unique identifier of the Node.
  String getId();
}
