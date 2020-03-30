package com.sf.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openxava.util.Users;
import org.openxava.util.XavaResources;

import com.openxava.naviox.util.NaviOXPreferences;

/**
 * @author lostinsoftware
 *
 */
public class Security {

	public final static String OBJ_ALL = "all";
	public final static String OBJ_KASKO = "KaskoIns";
	public final static String OBJ_GO = "GOIns";
	public final static String OBJ_CUSTOMER = "Customer";
	public final static String OBJ_CMR = "CMR";

	public final static String ACT_ALL = "all";
	public final static String ACT_HIDE_IMAGE = "hide-image";

	private final static String PREFERENCES_FILE = "naviox.properties";
	private static Log log = LogFactory.getLog(Security.class);

	private static SecurityManager securityManager;

	public static String getCurrentUser() {
		return Users.getCurrent();
	}

	public static boolean validUser(String username, String password) {
		SecurityManager sm = getSecurityManager();
		if (sm == null)
			return false;
		return sm.validUser(username, password);
	}

	private static SecurityManager getSecurityManager() {
		if (securityManager == null) {
			String type = NaviOXPreferences.getInstance().getSecurityManagerFactoryType();
			try {
				securityManager = SecurityManagerFactory.buildSecurityManager(type);
			} catch (SecurityException e) {
				log.error(XavaResources.getString("properties_file_error", PREFERENCES_FILE), e);
			}
		}
		return securityManager;
	}

	public static boolean hasPermission(String object, String action) {
		SecurityManager sm = getSecurityManager();
		if (sm == null)
			return false;
		return sm.hasPermission(getCurrentUser(), object, action);
	}

	public static boolean hasRole(String role) {
		SecurityManager sm = getSecurityManager();
		if (sm == null)
			return false;
		return sm.hasRole(getCurrentUser(), role);
	}

	public static boolean hasAnyObject(String... objects) {
		SecurityManager sm = getSecurityManager();
		if (sm == null)
			return false;
		return sm.hasAnyObject(getCurrentUser(), objects);
	}
}