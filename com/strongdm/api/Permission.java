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

// Permissions, all permissions that may be granted to an account.
public final class Permission {
  public static final String RELAY_LIST = "relay:list";
  public static final String RELAY_CREATE = "relay:create";
  public static final String DATASOURCE_LIST = "datasource:list";
  public static final String DATASOURCE_CREATE = "datasource:create";
  public static final String DATASOURCE_HEALTHCHECK = "datasource:healthcheck";
  public static final String DEPRECATED_DATASOURCE_GRANT = "datasource:grant";
  public static final String DATASOURCE_DELETE = "datasource:delete";
  public static final String DATASOURCE_UPDATE = "datasource:update";
  public static final String RESOURCE_LOCK_DELETE = "resourcelock:delete";
  public static final String RESOURCE_LOCK_LIST = "resourcelock:list";
  public static final String SECRET_ENGINE_CREATE = "secretengine:create";
  public static final String SECRET_ENGINE_LIST = "secretengine:list";
  public static final String SECRET_ENGINE_DELETE = "secretengine:delete";
  public static final String SECRET_ENGINE_UPDATE = "secretengine:update";
  public static final String SECRET_ENGINE_STATUS = "secretengine:status";
  public static final String SECRET_STORE_CREATE = "secretstore:create";
  public static final String SECRET_STORE_LIST = "secretstore:list";
  public static final String SECRET_STORE_DELETE = "secretstore:delete";
  public static final String SECRET_STORE_UPDATE = "secretstore:update";
  public static final String SECRET_STORE_STATUS = "secretstore:status";
  public static final String REMOTE_IDENTITY_GROUP_WRITE = "remoteidentitygroup:write";
  public static final String REMOTE_IDENTITY_GROUP_READ = "remoteidentitygroup:read";
  public static final String REMOTE_IDENTITY_WRITE = "remoteidentity:write";
  public static final String REMOTE_IDENTITY_READ = "remoteidentity:read";
  public static final String USER_CREATE = "user:create";
  public static final String USER_LIST = "user:list";
  public static final String USER_UPDATE_ADMIN = "user:update_admin";
  public static final String USER_CREATE_ADMIN_TOKEN = "user:create_admin_token";
  public static final String USER_CREATE_SERVICE_ACCOUNT = "user:create_service_account";
  public static final String USER_SET_PERMISSION_LEVEL = "user:set_strong_role";
  public static final String USER_UPDATE = "user:update";
  public static final String USER_INITIATE_PASSWORD_RESET = "user:initiate_password_reset";
  public static final String USER_DELETE = "user:delete";
  public static final String USER_ASSIGN = "user:assign";
  public static final String USER_SUSPEND = "user:suspend";
  public static final String USER_SET_PASSWORD = "user:set_password";
  public static final String ROLE_LIST = "role:list";
  public static final String ROLE_CREATE = "role:create";
  public static final String ROLE_DELETE = "role:delete";
  public static final String ROLE_UPDATE = "role:update";
  public static final String ORG_VIEW_SETTINGS = "organization:view_settings";
  public static final String ORG_EDIT_SETTINGS = "organization:edit_settings";
  public static final String ORG_DEPLOYMENT_DOCTOR = "organization:deployment_doctor";
  public static final String ORG_LIST_CHILDREN = "organization:list_children";
  public static final String ORG_CREATE_CHILD_ORGANIZATION =
      "organization:create_child_organization";
  public static final String ORG_AUDIT_USERS = "audit:users";
  public static final String ORG_AUDIT_ROLES = "audit:roles";
  public static final String ORG_AUDIT_DATASOURCES = "audit:datasources";
  public static final String ORG_AUDIT_NODES = "audit:nodes";
  public static final String ORG_AUDIT_PERMISSIONS = "audit:permissions";
  public static final String ORG_AUDIT_QUERIES = "audit:queries";
  public static final String ORG_AUDIT_ACTIVITIES = "audit:activities";
  public static final String ORG_AUDIT_SSH = "audit:ssh";
  public static final String ORG_AUDIT_ACCOUNT_GRANTS = "audit:accountgrants";
  public static final String ORG_AUDIT_ORG = "audit:organization";
  public static final String ORG_AUDIT_REMOTE_IDENTITIES = "audit:remoteidentities";
  public static final String ORG_AUDIT_REMOTE_IDENTITY_GROUPS = "audit:remoteidentitygroups";
  public static final String ORG_AUDIT_SECRET_ENGINES = "audit:secretengines";
  public static final String ORG_AUDIT_SECRET_STORES = "audit:secretstores";
  public static final String ORG_AUDIT_WORKFLOWS = "audit:workflows";
  public static final String ORG_AUDIT_APPROVAL_FLOWS = "audit:approvalflows";
  public static final String ORG_AUDIT_ACCESS_REQUESTS = "audit:accessrequests";
  public static final String ORG_AUDIT_POLICIES = "audit:policies";
  public static final String WORKFLOW_LIST = "workflow:list";
  public static final String WORKFLOW_EDIT = "workflow:edit";
  public static final String ACCESS_REQUEST_LIST = "accessrequest:list";
  public static final String ACCESS_REQUEST_REQUESTER = "accessrequest:requester";
  public static final String APPROVAL_FLOW_EDIT = "approvalflow:edit";
  public static final String APPROVAL_FLOW_LIST = "approvalflow:list";
  public static final String INSTALLATION_BLESS = "installation:bless";
  public static final String INSTALLATION_CREATE = "installation:create";
  public static final String INSTALLATION_REVOKE = "installation:revoke";
  public static final String TESTING_ORG_CREATE = "testing:organization:create";
  public static final String TESTING_ORG_DELETE = "testing:organization:delete";
  public static final String TESTING_NO_PERMISSIONS = "testing:noperms";
  public static final String TESTING_FETCH_QUERIES = "testing:queries:get";
  public static final String GRANT_READ = "grant:read";
  public static final String GRANT_WRITE = "grant:write";
  public static final String REPORT_READ = "report:read";
  public static final String BILLING_READ = "billing:read";
  public static final String CREDENTIAL_READ = "credential:read";
  public static final String CREDENTIAL_WRITE = "credential:write";
  public static final String POLICY_READ = "policy:read";
  public static final String POLICY_WRITE = "policy:write";
  public static final String MANAGED_SECRET_CREATE = "managedsecret:create";
  public static final String MANAGED_SECRET_LIST = "managedsecret:list";
  public static final String MANAGED_SECRET_DELETE = "managedsecret:delete";
  public static final String MANAGED_SECRET_UPDATE = "managedsecret:update";
  public static final String MANAGED_SECRET_READ = "managedsecret:read";
}
