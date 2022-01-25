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
package samples;

import com.strongdm.api.v1.*;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client(
            System.getenv("SDM_API_ACCESS_KEY"),
            System.getenv("SDM_API_SECRET_KEY")
        );

        // create a redis
        Redis redis = new Redis();
        redis.setName("accessRuleTest");
        redis.setHostname("example.com");
        redis.setPort(6379);
        redis.setPortOverride(2001);
        redis.setTags(java.util.Map.of(
            "env", "staging"
        ));
        redis = (Redis)client.resources().create(redis).getResource();

        // create a role with an initial access rule
        Role role = new Role();
        role.setName("accessRuleTest");
        AccessRule rule1 = new AccessRule();
        rule1.setIds(java.util.List.of(redis.getId()));
        role.setAccessRules(java.util.List.of(rule1));
        role = client.roles().create(role).getRole();

        // update the role's access rules
        AccessRule rule2 = new AccessRule();
        rule2.setType("postgres");
        AccessRule rule3 = new AccessRule();
        rule3.setTags(java.util.Map.of(
            "env", "staging"
        ));
        role.setAccessRules(java.util.List.of(rule2, rule3));
        role = client.roles().update(role).getRole();

        // The RoleGrants API has been deprecated in favor of Access Rules. When
        // using Access Rules the best practice is to grant Resources access
        // based on Type and Tags. If it is _necessary_ to grant access to
        // specific Resources in the same way as RoleGrants did, you can use
        // Resource IDs directly in Access Rules as shown in the following
        // examples.

        createRoleGrantViaAccessRulesExample(client);
        deleteRoleGrantViaAccessRulesExample(client);
        listRoleGrantsViaAccessRulesExample(client);
    }

    private static void createRoleGrantViaAccessRulesExample(Client client) {
        // create example resources
        String resourceId1 = createExampleResource(client);
        String resourceId2 = createExampleResource(client);
        AccessRule rule = new AccessRule();
        rule.setIds(java.util.List.of(resourceId1));
        String roleId = createExampleRole(client, java.util.List.of(rule));

        // get the role
        Role role = client.roles().get(roleId).getRole();

        // append the ID to an existing static access rule
        if (role.getAccessRules().size() != 1 || role.getAccessRules().get(0).getIds().size() == 0) {
            throw new RuntimeException("unexpected access rules in role");
        }
        role.getAccessRules().get(0).getIds().add(resourceId2);

        // update the role
        client.roles().update(role);
    }

    private static void deleteRoleGrantViaAccessRulesExample(Client client) {
        // create example resources
        String resourceId1 = createExampleResource(client);
        String resourceId2 = createExampleResource(client);
        AccessRule rule = new AccessRule();
        rule.setIds(java.util.List.of(resourceId1, resourceId2));
        String roleId = createExampleRole(client, java.util.List.of(rule));

        // get the role
        Role role = client.roles().get(roleId).getRole();

        if (role.getAccessRules().size() != 1 || role.getAccessRules().get(0).getIds().size() == 0) {
            throw new RuntimeException("unexpected access rules in role");
        }

        // remove the ID of the second Resource
        java.util.List<String> ids = role.getAccessRules().get(0).getIds();
        ids.remove(resourceId2);

        // update the role
        client.roles().update(role);
    }

    private static void listRoleGrantsViaAccessRulesExample(Client client) {
        // create example resources
        String resourceId = createExampleResource(client);
        AccessRule rule = new AccessRule();
        rule.setIds(java.util.List.of(resourceId));
        String roleId = createExampleRole(client, java.util.List.of(rule));

        // get the role
        Role role = client.roles().get(roleId).getRole();

        // role.AccessRules contains each AccessRule associated with the Role
        for (String id : role.getAccessRules().get(0).getIds()) {
            System.out.println(id);
        }
    }

    // createExampleRole create a role with empty access rules and return the ID
    private static String createExampleRole(Client client, java.util.List<AccessRule> ar) {
        Role role = new Role();
        role.setName("exampleRole-" + Integer.toString(new java.util.Random().nextInt(10000000)));
        role.setAccessRules(ar);
        return client.roles().create(role).getRole().getId();
    }

    // createExampleResource create a sample resource and return the ID
    private static String createExampleResource(Client client) {
        Redis redis = new Redis();
        redis.setName("exampleResource-" + Integer.toString(new java.util.Random().nextInt(10000000)));
        redis.setHostname("example.com");
        redis.setPort(6379);
        redis.setPortOverride(new java.util.Random().nextInt(20000) + 3000);
        return client.resources().create(redis).getResource().getId();
    }
}