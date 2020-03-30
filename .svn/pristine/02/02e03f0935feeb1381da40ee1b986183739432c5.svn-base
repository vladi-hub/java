/* 
 * All content copyright Terracotta, Inc., unless otherwise indicated. All rights reserved. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not 
 * use this file except in compliance with the License. You may obtain a copy 
 * of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 * 
 */

package com.sf.quartz.scheduler;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * This Example will demonstrate all of the basics of scheduling capabilities of
 * Quartz using Cron Triggers.
 * 
 * @author Bill Kratzer
 */
public class CronDateCheckerFS {

	public void run() throws Exception {
		Logger log = LoggerFactory.getLogger(CronDateCheckerFS.class);

		log.info("------- Initializing -------------------");

		// First we must get a reference to a scheduler
		SchedulerFactory sf = new StdSchedulerFactory();
		Scheduler sched = sf.getScheduler();

		log.info("------- Initialization Complete --------");

		log.info("------- Scheduling Jobs ----------------");

		// jobs can be scheduled before sched.start() has been called

		// job 1 will run every 20 seconds
		JobDetail job = newJob(MonthlyJob.class).withIdentity("job1", "group1").build();

		CronTrigger trigger = newTrigger().withIdentity("trigger1", "group1")
				.withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(24, 0)).build();

		Date ft = sched.scheduleJob(job, trigger);
		log.info(job.getKey() + " has been scheduled to run at: " + ft + " and repeat based on expression: "
				+ trigger.getCronExpression());

		// job 2 will run every other minute (at 15 seconds past the minute)
		job = newJob(WeeklyJob.class).withIdentity("job2", "group1").build();

		trigger = newTrigger().withIdentity("trigger2", "group1")
				.withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(22, 0)).build();

		ft = sched.scheduleJob(job, trigger);
		log.info(job.getKey() + " has been scheduled to run at: " + ft + " and repeat based on expression: "
				+ trigger.getCronExpression());

		// job 3 will run every other minute but only between 8am and 5pm
		job = newJob(DailyJob.class).withIdentity("job3", "group1").build();

		trigger = newTrigger().withIdentity("trigger3", "group1")
				.withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(23, 0)).build(); // fire
																						// every
																						// day
																						// at
																						// 15:00

		ft = sched.scheduleJob(job, trigger);
		log.info(job.getKey() + " has been scheduled to run at: " + ft + " and repeat based on expression: "
				+ trigger.getCronExpression());

		log.info("------- Starting Scheduler ----------------");

		// All of the jobs have been added to the scheduler, but none of the
		// jobs
		// will run until the scheduler has been started
		sched.start();

		log.info("------- Started Scheduler -----------------");

		log.info("------- Waiting five minutes... ------------");
		try {
			// wait five minutes to show jobs
			Thread.sleep(300L * 1000L);
			// executing...
		} catch (Exception e) {
			//
		}

		log.info("------- Shutting Down ---------------------");

		sched.shutdown(true);
		log.info("------- Shutdown Complete -----------------");

		SchedulerMetaData metaData = sched.getMetaData();
		log.info("Executed " + metaData.getNumberOfJobsExecuted() + " jobs.");
	}

	public static void main(String[] args) throws Exception {
		CronDateCheckerFS example = new CronDateCheckerFS();
		example.run();
	}
}