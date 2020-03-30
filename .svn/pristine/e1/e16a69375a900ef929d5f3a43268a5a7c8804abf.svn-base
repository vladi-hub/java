package com.sf.configuration;

import java.io.*;
import java.util.*;

public class ConfigurationManager {

	
	private static ConfigurationManager instance = null;
	private static Properties prop = null;
	
	public static String mailAlert1 = "mail.expire.alert.1";
	public static String mailAlert2 = "mail.expire.alert.2";
	public static String mailAlert3 = "mail.expire.alert.3";
	
	public static String mailFrom = "mail.from";
	
    protected ConfigurationManager() {
       // Exists only to defeat instantiation.
    	init();
    }
   
	public static ConfigurationManager getConfiguration(){
		if(instance == null) {
	         instance = new ConfigurationManager();
	         prop = new Properties();
	      }
	      return instance;
	}
	
	private void init(){
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = this.getClass().getResourceAsStream("smartfin.properties");
			prop.load(input);
			// set the properties value

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public String getConfigurationValue(String key){
		return prop.getProperty(key);
	}
}