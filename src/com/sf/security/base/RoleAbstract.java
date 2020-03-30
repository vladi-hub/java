package com.sf.security.base;

import java.util.Map;

import com.sf.security.Role;

/**
 * @author lostinsoftware
 *
 */
public abstract class RoleAbstract implements Role {

  private String rolename;
  private Map<String, String> permissions;

  @Override
  public String getRolename() {
    return rolename;
  }

  @Override
  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  @Override
  public Map<String, String> getPermissions() {
    return permissions;
  }

  @Override
  public void setPermissions(Map<String, String> permissions) {
    this.permissions=permissions;
  }

}