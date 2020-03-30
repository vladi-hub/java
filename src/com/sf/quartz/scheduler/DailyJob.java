package com.sf.quartz.scheduler;

import java.util.*;

import org.quartz.*;
import org.slf4j.*;

import com.sf.configuration.*;
import com.sf.mail.*;

public class DailyJob implements Job {

	
    private static Logger _log = LoggerFactory.getLogger(DailyJob.class);

    /**
     * Quartz requires a public empty constructor so that the
     * scheduler can instantiate the class whenever it needs.
     */
    public DailyJob() {
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
        List<InsuranceDataBean> res = ExpirationUtil.loadDailyExpiringPolicies();
        
        ConfigurationManager cm = ConfigurationManager.getConfiguration();
        if(res.size() > 0){
        	StringBuffer sb = new StringBuffer();
        	for (Iterator<InsuranceDataBean> i = res.iterator(); i.hasNext();){ 
        		InsuranceDataBean db = i.next();
        		sb.append(db.toString(" DAY "));
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