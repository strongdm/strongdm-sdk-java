// Copyright 2020 StrongDM Inc
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// This file was generated by protogen. DO NOT EDIT.

package com.strongdm.api;

/**
 * Nodes make up the strongDM network, and allow your users to connect securely to your resources.
 * There are two types of nodes: 1. **Relay:** creates connectivity to your datasources, while
 * maintaining the egress-only nature of your firewall 1. **Gateways:** a relay that also listens
 * for connections from strongDM clients
 */
public interface Node {
  /** Returns the unique identifier of the Node. */
  String getId();
  /** Returns the tags of the Node. */
  java.util.Map<String, String> getTags();
  /** Sets the tags of the Node. */
  void setTags(java.util.Map<String, String> tags);
  /** Returns the name of the Node. */
  String getName();
  /** Sets the name of the Node. */
  void setName(String name);
}