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

// Activity Verbs, describe which kind of activity has taken place.
public final class ActivityVerb {
  public static final String USER_ADDED = "user added";
  public static final String USER_DELETED = "user deleted";
  public static final String USER_UPDATED = "user updated";
  public static final String USER_SIGNUP = "user signup";
  public static final String USER_TYPE_CHANGED = "user type changed";
  public static final String USER_TEMPORARY_ACCESS_GRANTED = "user temporary access granted";
  public static final String USER_TEMPORARY_ACCESS_REVOKED = "user temporary access revoked";
  public static final String USER_TEMPORARY_ACCESS_EXPIRED = "user temporary access expired";
  public static final String USER_ADDED_TO_ROLE = "user added to role";
  public static final String USER_DELETED_FROM_ROLE = "user deleted from role";
  public static final String USER_SUSPENDED = "user suspended";
  public static final String USER_REINSTATED = "user reinstated";
  public static final String USER_LOGGED_INTO_THE_UI = "user logged into the Admin UI";
  public static final String PARENT_ADMIN_LOGGED_INTO_CHILD_ORG =
      "parent admin logged into the child org";
  public static final String USER_LOGGED_INTO_THE_CLIENT = "user logged into the local client";
  public static final String SERVICE_ACCOUNT_CREATED = "service account created";
  public static final String SERVICE_ACCOUNT_EXPIRED = "service account expired";
  public static final String ADMIN_TOKEN_ADDED = "admin token created";
  public static final String ADMIN_TOKEN_DELETED = "admin token deleted";
  public static final String ADMIN_TOKEN_EXPIRED = "admin token expired";
  public static final String ADMIN_TOKEN_REKEYED = "admin token rekeyed";
  public static final String ADMIN_TOKEN_CLONED = "admin token cloned";
  public static final String ADMIN_TOKEN_SUSPENDED = "admin token suspended";
  public static final String ADMIN_TOKEN_REINSTATED = "admin token reinstated";
  public static final String SSO_USER_LOGGED_INTO_THE_UI =
      "user logged into the Admin UI using SSO";
  public static final String SSO_USER_LOGGED_INTO_THE_CLIENT =
      "user logged into the local client using SSO";
  public static final String USER_LOGGED_OUT_FROM_THE_CLIENT =
      "user logged out from the local client";
  public static final String USER_LOGGED_OUT_FROM_THE_UI = "user logged out from the Admin UI";
  public static final String FAILED_LOGIN_FROM_THE_UI = "failed login attempt from the Admin UI";
  public static final String FAILED_LOGIN_FROM_THE_CLIENT =
      "failed login attempt from the local client";
  public static final String MFA_DENIED_FROM_THE_UI = "MFA denied access for the Admin UI";
  public static final String MFA_DENIED_FROM_THE_CLIENT = "MFA denied access for the local client";
  public static final String TOO_MANY_ATTEMPTS_LOCKOUT =
      "user account locked due to failed login attempts";
  public static final String ATTEMPT_COUNTER_RESET = "failed login attempt counter reset";
  public static final String SUSPENDED_USER_LOGIN_ATTEMPT_FROM_THE_CLIENT =
      "attempt to login by a suspended user from the local client";
  public static final String SUSPENDED_USER_LOGIN_ATTEMPT_FROM_THE_UI =
      "attempt to login by a suspended user from the Admin UI";
  public static final String SERVICE_ACCOUNT_LOGIN_ATTEMPT_FROM_THE_UI =
      "attempted to login by a service account from the Admin UI";
  public static final String SUSPENDED_SERVICE_ACCOUNT_LOGIN_ATTEMPT_FROM_THE_UI =
      "attempted to login by a suspended service account from the Admin UI";
  public static final String SUSPENDED_SERVICE_ACCOUNT_LOGIN_ATTEMPT_FROM_THE_CLIENT =
      "attempt to login by a suspended service account from the local client";
  public static final String USER_SET_A_PASSWORD = "user set a password";
  public static final String USER_RESET_A_PASSWORD = "user reset their password";
  public static final String USER_CHANGED_PASSWORD = "user changed their password";
  public static final String USER_INVITED = "user invited";
  public static final String USER_CLICKED_INVITATION = "user clicked on their invitation";
  public static final String USER_CLICKED_PASSWORD_RESET = "user clicked on their password reset";
  public static final String USER_ALLOW_PASSWORD_LOGIN = "user allowed to login via password";
  public static final String USER_REQUIRE_SSO_LOGIN = "user required to login via SSO";
  public static final String USER_PROVISIONING_ENABLED = "user provisioning enabled";
  public static final String USER_PROVISIONING_DISABLED = "user provisioning disabled";
  public static final String ADMIN_INITIATED_PASSWORD_RESET = "admin initiated password reset";
  public static final String ROLE_ADDED = "role added";
  public static final String ROLE_DELETED = "role deleted";
  public static final String ROLE_UPDATED = "role updated";
  public static final String ROLE_ACCESS_RULES_UPDATED = "access rules updated";
  public static final String ROLE_ACCESS_RULES_CREATED = "access rules created";
  public static final String ROLE_ACCESS_RULES_DELETED = "access rules deleted";
  public static final String ROLE_PROVISIONING_ENABLED = "role provisioning enabled";
  public static final String ROLE_PROVISIONING_DISABLED = "role provisioning disabled";
  public static final String DATASOURCE_ADDED = "datasource added";
  public static final String DATASOURCE_CLONED = "datasource cloned";
  public static final String DATASOURCE_DELETED = "datasource deleted";
  public static final String DATASOURCE_UPDATED = "datasource updated";
  public static final String DATASOURCE_PORT_OVERRIDE = "datasource connection port overriden";
  public static final String MULTIPLE_DATASOURCE_PORT_OVERRIDE =
      "multiple datasource ports overriden";
  public static final String SERVER_ADDED = "server added";
  public static final String SERVER_CLONED = "server cloned";
  public static final String SERVER_DELETED = "server deleted";
  public static final String SERVER_UPDATED = "server updated";
  public static final String SERVER_PORT_OVERRIDE = "server connection port overriden";
  public static final String MULTIPLE_SERVER_PORT_OVERRIDE = "multiple server ports overriden";
  public static final String CLUSTER_ADDED = "cluster added";
  public static final String CLUSTER_CLONED = "cluster cloned";
  public static final String CLUSTER_DELETED = "cluster deleted";
  public static final String CLUSTER_UPDATED = "cluster updated";
  public static final String CLUSTER_PORT_OVERRIDE = "cluster connection port overriden";
  public static final String MULTIPLE_CLUSTER_PORT_OVERRIDE = "multiple cluster ports overriden";
  public static final String CLOUD_ADDED = "cloud added";
  public static final String CLOUD_CLONED = "cloud cloned";
  public static final String CLOUD_DELETED = "cloud deleted";
  public static final String CLOUD_UPDATED = "cloud updated";
  public static final String WEBSITE_ADDED = "website added";
  public static final String WEBSITE_CLONED = "website cloned";
  public static final String WEBSITE_DELETED = "website deleted";
  public static final String WEBSITE_UPDATED = "website updated";
  public static final String INSTALLATION_CREATED = "installation created";
  public static final String RELAY_INSTALLATION_CREATED = "installation created for relay";
  public static final String INSTALLATION_APPROVED = "installation approved";
  public static final String INSTALLATION_REVOKED = "installation revoked";
  public static final String RELAY_CREATED = "relay created";
  public static final String RELAY_UPDATED_NAME = "relay name updated";
  public static final String RELAY_DELETED = "relay deleted";
  public static final String ORG_PUBLIC_KEY_UPDATED = "public key updated";
  public static final String ORG_ENFORCE_PORT_OVERRIDES_UPDATED =
      "port override enforcement updated";
  public static final String ORG_SERVICE_AUTO_CONNECT_UPDATED =
      "service account auto-connect updated";
  public static final String ORG_SELF_REGISTRATION_ACTIVATED = "self-registration activated";
  public static final String ORG_SELF_REGISTRATION_DEACTIVATED = "self-registration deactivated";
  public static final String ORG_NAME_UPDATED = "organization name updated";
  public static final String ORG_SETTING_UPDATED = "organization setting updated";
  public static final String ORG_CREATED = "organization created";
  public static final String ORG_SCIM_PROVISIONING_UPDATED = "SCIM provider set";
  public static final String ORG_SCIM_PROVISIONING_DELETED = "SCIM provider deleted";
  public static final String ORG_CUSTOM_PROVISIONING_UPDATED = "Provisioning provider set";
  public static final String ORG_CUSTOM_PROVISIONING_DELETED = "Provisioning provider deleted";
  public static final String CHILD_ORG_ADMIN_INVITED = "child organization admin invited";
  public static final String SERVICE_ACCOUNT_REKEYED = "service account rekeyed";
  public static final String SCIM_TOKEN_ADDED = "SCIM token created";
  public static final String SCIM_TOKEN_DELETED = "SCIM token deleted";
  public static final String SCIM_TOKEN_REKEYED = "SCIM token rekeyed";
  public static final String API_KEY_DELETED = "API key deleted";
  public static final String ORG_SSH_CERTIFICATE_AUTHORITY_ROTATED =
      "organization SSH certificate authority rotated";
  public static final String ORG_SSH_ALLOW_PORT_FORWARDING = "allowed SSH port forwarding";
  public static final String ORG_SSH_DISALLOW_PORT_FORWARDING = "disallowed SSH port forwarding";
  public static final String ORG_ADD_CHILD = "add child organization";
  public static final String ORG_REMOVE_CHILD = "remove child organization";
  public static final String ORG_EXTEND_TRIAL = "trial extended";
  public static final String SECRET_STORE_ADDED = "secret store added";
  public static final String SECRET_STORE_UPDATED = "secret store updated";
  public static final String SECRET_STORE_DELETED = "secret store deleted";
  public static final String REMOTE_IDENTITY_GROUP_CREATED = "remote identity group created";
  public static final String REMOTE_IDENTITY_GROUP_UPDATED = "remote identity group updated";
  public static final String REMOTE_IDENTITY_GROUP_DELETED = "remote identity group deleted";
  public static final String REMOTE_IDENTITY_CREATED = "remote identity created";
  public static final String REMOTE_IDENTITY_UPDATED = "remote identity updated";
  public static final String REMOTE_IDENTITY_DELETED = "remote identity deleted";
  public static final String ACCESS_REQUESTED_TO_RESOURCE = "access requested to resource";
  public static final String ACCESS_REQUEST_TO_RESOURCE_APPROVED =
      "access request to resource approved";
  public static final String ACCESS_REQUEST_TO_RESOURCE_CANCELED =
      "access request to resource canceled";
  public static final String ACCESS_REQUEST_TO_RESOURCE_DENIED =
      "access request to resource denied";
  public static final String ACCESS_REQUEST_TO_RESOURCE_TIMED_OUT =
      "access request to resource timed out";
  public static final String WORKFLOW_RESOURCE_ASSIGNED = "resource assigned to workflow";
  public static final String WORKFLOW_RESOURCE_UNASSIGNED = "resource unassigned from workflow";
  public static final String WORKFLOW_RESOURCE_MULTIPLE_ASSIGNED =
      "multiple resources assigned to workflow";
  public static final String WORKFLOW_RESOURCE_MULTIPLE_UNASSIGNED =
      "multiple resources unassigned from workflow";
  public static final String WORKFLOW_NOTIFICATION_OPTION_ADDED =
      "workflow notification type added";
  public static final String WORKFLOW_NOTIFICATION_OPTION_REMOVED =
      "workflow notification type removed";
  public static final String WORKFLOW_NOTIFICATION_OPTIONS_UPDATED =
      "workflow notification settings updated";
  public static final String ORG_VNM_SUBNET_UPDATED = "organization VNM subnet updated";
  public static final String DEPRECATED_ORG_ACTIVATE_DEVICE_APPROVAL = "activate device approval";
  public static final String DEPRECATED_ORG_DEACTIVATE_DEVICE_APPROVAL =
      "deactivate device approval";
  public static final String EMULATION_MIGRATION_COMPLETED = "emulation migration completed";
  public static final String ACCESS_OVERHAUL_MIGRATION_COMPLETED =
      "access overhaul migration completed";
  public static final String ACTIVATED_SSH_PORT_FORWARDING_ALL_SERVER =
      "enabled SSH port forwarding on all servers";
}