package com.sf.security.base;

import java.util.List;
import com.sf.security.Role;
import com.sf.security.User;

/**
 * @author lostinsoftware
 *
 */
public abstract class UserAbstract implements User {

  private String username;
  private String password;
  private String fullname;
  private List<Role> roles;
  
  @Override
  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  
  
  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getFullname() {
    return fullname;
  }

  @Override
  public List<Role> getRoles() {
    return roles;
  }

  @Override
  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }
  
}