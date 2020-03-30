package com.sf.quartz.scheduler;

import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.naming.*;
import javax.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sf.configuration.*;
import com.sf.mail.*;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;


public class WeeklyJob implements Job {

	
	
    private static Logger _log = LoggerFactory.getLogger(WeeklyJob.class);

    /**
     * Quartz requires a public empty constructor so that the
     * scheduler can instantiate the class whenever it needs.
     */
    public WeeklyJob() {
    }

    /**
     * <p>
     * Called by the <code>{@link org.quartz.Scheduler}</code> when a
     * <code>{@link org.quartz.Trigger}</code> fires that is associated with
     * the <code>Job</code>.
     * </p>
     * 
     * @throws JobExecutionException
     *             if there is an exception while executing the job.
     */
    public void execute(JobExecutionContext context)
        throws JobExecutionException {

        // This job simply prints out its job name and the
        // date and time that it is running
        JobKey jobKey = context.getJobDetail().getKey();
        _log.info("SimpleJob says: " + jobKey + " executing at " + new Date());
        List<InsuranceDataBean> res = ExpirationUtil.loadWeeklyExpirationPolicies();
        
        ConfigurationManager cm = ConfigurationManager.getConfiguration();
        if(res.size() > 0){
        	StringBuffer sb = new StringBuffer();
        	for (Iterator<InsuranceDataBean> i = res.iterator(); i.hasNext();){ 
        		InsuranceDataBean db = i.next();
        		sb.append(db.toString(" WEEK "));
        		try {
	        		SFMailer.sendMessage(cm.getConfigurationValue(ConfigurationManager.mailAlert1), cm.getConfigurationValue(ConfigurationManager.mailFrom), "Expiring Policies", sb.toString());
	        		SFMailer.sendMessage(cm.getConfigurationValue(ConfigurationManager.mailAlert2), cm.getConfigurationValue(ConfigurationManager.mailFrom), "Expiring Policies", sb.toString());
	        		SFMailer.sendMessage(cm.getConfigurationValue(ConfigurationManager.mailAlert3), cm.getConfigurationValue(ConfigurationManager.mailFrom), "Expiring Policies", sb.toString());
        		} catch (Exception ex){
        			ex.printStackTrace();
        		}
        	}
        	
        }
    }

	

}
