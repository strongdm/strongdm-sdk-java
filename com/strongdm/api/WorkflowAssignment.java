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

// Code generated by protogen. DO NOT EDIT.

package com.strongdm.api;

/**
 * WorkflowAssignment links a Resource to a Workflow. The assigned resources are those that a user
 * can request access to via the workflow.
 */
public class WorkflowAssignment {
  private String resourceId;
  /** The resource id. */
  public String getResourceId() {
    return this.resourceId;
  }
  /** The resource id. */
  public void setResourceId(String in) {
    this.resourceId = in;
  }

  private String workflowId;
  /** The workflow id. */
  public String getWorkflowId() {
    return this.workflowId;
  }
  /** The workflow id. */
  public void setWorkflowId(String in) {
    this.workflowId = in;
  }
}
