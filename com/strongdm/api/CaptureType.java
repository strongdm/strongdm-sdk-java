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
// Code generated by constgen. DO NOT EDIT.

package com.strongdm.api;

// CaptureType designates what type of SSH/RDP/K8s capture we have.
public final class CaptureType {
  public static final String SHELL = "shell";
  public static final String SCP_UPLOAD = "scp-upload";
  public static final String SCP_DOWNLOAD = "scp-download";
  public static final String COMMAND = "command";
  public static final String RDP_BASIC = "rdp-basic";
  public static final String RDP_ENHANCED = "rdp-enhanced";
  public static final String K_8_S_EXEC = "k8s-exec";
  public static final String K_8_S_EXEC_TTY = "k8s-execTTY";
  public static final String K_8_S_PORT_FORWARD = "k8s-portForward";
  public static final String K_8_SCP_UPLOAD = "k8s-cp-upload";
  public static final String K_8_SCP_DOWNLOAD = "k8s-cp-download";
  public static final String K_8_S_DESCRIBE = "k8s-describe";
  public static final String K_8_S_GET = "k8s-get";
  public static final String K_8_S_DELETE = "k8s-delete";
  public static final String K_8_S_GENERIC = "k8s-generic";
  public static final String K_8_S_APPLY = "k8s-apply";
  public static final String SSH_PORT_FORWARD = "ssh-portForward";
}