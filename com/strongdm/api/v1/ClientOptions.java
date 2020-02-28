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

package com.strongdm.api.v1;

public class ClientOptions {
  private String host;

  public String getHost() {
    return this.host;
  }

  private int port;

  public int getPort() {
    return this.port;
  }

  private boolean insecure;

  public boolean getInsecure() {
    return this.insecure;
  }

  public ClientOptions() {
    this.host = "api.strongdm.com";
    this.port = 443;
    this.insecure = false;
  }

  private ClientOptions copy() {
    ClientOptions c = new ClientOptions();
    c.host = this.host;
    c.insecure = this.insecure;
    c.port = this.port;
    return c;
  }

  public ClientOptions withHostAndPort(String host, int port) {
    ClientOptions c = this.copy();
    c.host = host;
    c.port = port;
    return c;
  }

  public ClientOptions withInsecure() {
    ClientOptions c = this.copy();
    c.insecure = true;
    return c;
  }
}
