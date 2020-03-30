package com.sf.security;


import java.util.List;

/**
 * @author lostinsoftware
 *
 */
public interface User {

  public void setUsername(String username);
  public String getUsername();
  public void setPassword(String password);
  public String getPassword();
  public void setFullname(String fullname);
  public String getFullname();
  public List<Role> getRoles();
  public void setRoles(List<Role> roles);
}