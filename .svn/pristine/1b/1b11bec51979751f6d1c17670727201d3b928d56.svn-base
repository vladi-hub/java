package com.sf.security;

/**
 * @author lostinsoftware
 *
 */
public interface SecurityManager {
  
  public void init(Object securitySource) throws SecurityException;
  public boolean validUser(String username, String password);
  public boolean hasRole(String username, String rolename);
  public boolean hasPermission(String username, String object, String action);
  public boolean hasAnyObject(String username, String ... objects);
  
  
}