package com.sf.actions;

import java.util.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;
 
import org.openxava.actions.*;
import org.openxava.model.*;
import org.openxava.util.*;
import org.openxava.validators.*;

import com.sf.quartz.scheduler.*;

public class PolicyExpirationReportsDaily extends JasperReportBaseAction {
	
	private List<InsuranceDataBean> expiring;
	 
    public Map getParameters() throws Exception  { 
    	Messages errors =
                MapFacade.validate("DailyExpire", getView().getValues());
            if (errors.contains()) throw new ValidationException(errors);   // 2
        int i = 1;
        Map parameters = new HashMap();
        //for(InsuranceDataBean ib : expiring) {
        //	parameters.put(i, ib);
	    //    i++;
        //}
        //parameter.put("","");
        parameters.put("Policy id","System ID of the policy");
        parameters.put("Policy No","Policy Number");
        parameters.put("Policy Type", "Type of insurance");
        parameters.put("End date", "Policy Expiration date");
        return parameters;
    }
 
    protected JRDataSource getDataSource() throws Exception {                      // 4
        return new JRBeanCollectionDataSource(getExpiringPolicies());
    }
 
    protected String getJRXML() {                                                  // 5
        return "Products.jrxml"; // To read from classpath
        // return "/home/javi/Products.jrxml"; // To read from file system
    }
 
    private List<InsuranceDataBean> getExpiringPolicies() {
        if (expiring == null) {
            // Using JPA, the usual with OX3
        	try{
        		expiring = ExpirationUtil.loadDailyExpiringPolicies();
        	}catch (Exception ex){
        		ex.printStackTrace();
        	}
         
        }
        return expiring;
    }
 
}