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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * An AccessRule grants access to a set of Resources. There are two kinds of AccessRules:
 *
 * <p>- Dynamic: a rule which identifies Resources based on their type or tags - Static: a rule
 * which contains an explicit list of Resource IDs
 */
public class AccessRule {
  private java.util.Map<String, String> tags;

  public java.util.Map<String, String> getTags() {
    java.util.Map<String, String> m = new java.util.HashMap<String, String>();
    if (this.tags != null) {
      m.putAll(this.tags);
    }
    return m;
  }

  /**
   * Specifies a list of key/value pairs. You can set this field by itself to grant access to all
   * Resources which have all the given tags. You can also use it in conjunction with the Type field
   * to further narrow down the scope of Resources granted.
   */
  public void setTags(java.util.Map<String, String> in) {
    if (in == null) {
      this.tags = null;
      return;
    }
    this.tags = new java.util.HashMap<String, String>();
    this.tags.putAll(in);
  }

  private ArrayList<String> ids = new ArrayList<String>();

  public List<String> getIds() {
    return this.ids;
  }

  public String getId(int index) {
    return this.ids.get(index);
  }

  public int getIdsCount() {
    return this.ids.size();
  }

  public void setId(int index, String v) {
    this.ids.set(index, v);
  }

  public void removeId(int index) {
    this.ids.remove(index);
  }

  public void addId(String v) {
    this.ids.add(v);
  }

  public void addAllIds(Collection<String> v) {
    this.ids.addAll(v);
  }

  /**
   * Sets a list of Resource IDs granted by this AccessRule. If this field is set, the rule is a
   * static access rule. No other fields can be set on a static access rule.
   */
  public void setIds(Collection<String> in) {
    this.ids = new ArrayList<>(in);
  }

  public void clearIds() {
    this.ids.clear();
  }

  private String type = "";

  public String getType() {
    return this.type;
  }

  /**
   * Specifies a Resource type. You can set this field by itself to grant access to all Resources of
   * a certain type. You can also use it in conjunction with the Tags field to further narrow down
   * the scope of Resources granted.
   *
   * <p>See the following link for a list of possible values for this field:
   * https://www.strongdm.com/docs/cli/filters/#potential-resource-type-values
   */
  public void setType(String type) {
    this.type = type;
  }

  private Privileges privileges;

  public void setPrivileges(Privileges privileges) {
    this.privileges = privileges;
  }

  public Privileges getPrivileges() {
    return this.privileges;
  }

  public static class Privileges {
    private K8sPrivileges k8s;
    private EntraGroupsPrivileges entraGroups;

    public void setK8s(K8sPrivileges k8sPrivileges) {
      this.k8s = k8sPrivileges;
    }

    public K8sPrivileges getK8s() {
      return this.k8s;
    }

    public void setEntraGroups(EntraGroupsPrivileges entraGroupsPrivileges) {
      this.entraGroups = entraGroupsPrivileges;
    }

    public EntraGroupsPrivileges getEntraGroups() {
      return this.entraGroups;
    }
  }

  public static class K8sPrivileges {
    private ArrayList<String> groups = new ArrayList<String>();

    public List<String> getGroups() {
      return this.groups;
    }

    public String getGroup(int index) {
      return this.groups.get(index);
    }

    public int getGroupsCount() {
      return this.groups.size();
    }

    public void setGroup(int index, String v) {
      this.groups.set(index, v);
    }

    public void removeGroup(int index) {
      this.groups.remove(index);
    }

    public void addGroup(String v) {
      this.groups.add(v);
    }

    public void addAllGroups(Collection<String> v) {
      this.groups.addAll(v);
    }

    public void setGroups(Collection<String> in) {
      this.groups = new ArrayList<>(in);
    }

    public void clearGroups() {
      this.groups.clear();
    }
  }

  public static class EntraGroupsPrivileges {
    private ArrayList<String> groups = new ArrayList<String>();

    public List<String> getGroups() {
      return this.groups;
    }

    public String getGroup(int index) {
      return this.groups.get(index);
    }

    public int getGroupsCount() {
      return this.groups.size();
    }

    public void setGroup(int index, String v) {
      this.groups.set(index, v);
    }

    public void removeGroup(int index) {
      this.groups.remove(index);
    }

    public void addGroup(String v) {
      this.groups.add(v);
    }

    public void addAllGroups(Collection<String> v) {
      this.groups.addAll(v);
    }

    public void setGroups(Collection<String> in) {
      this.groups = new ArrayList<>(in);
    }

    public void clearGroups() {
      this.groups.clear();
    }
  }
}
