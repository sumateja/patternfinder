package com.equities.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sumateja K
 *
 * This source code is not open and can be used only with permissions.
 *  MyScheduler.java 2015
 */
public class MyScheduler {

	private JobLauncher jobLauncher;
	
	private Job eodBatchJob;
	
	private JobExecution execution;
	
	public void run()
	{
    	String csvFile=new BhavCopyCashMarketURLBean().getCsvFileName();
    	System.out.println("FROM SCHEDULER"+csvFile);
    	Map<String,JobParameter> map=new HashMap<String,JobParameter>();
    	JobParameter jobParam=new JobParameter(csvFile);
    	map.put("FILE", jobParam);
    	try {
			execution=jobLauncher.run(eodBatchJob, new JobParameters(map));
			
			System.out.print("Execution Status:"+ execution.getExitStatus());
		} catch (JobExecutionAlreadyRunningException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobRestartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setJobLauncher(JobLauncher jobLauncher)
	{
		this.jobLauncher=jobLauncher;
	}
	
	public void setEodBatchJob(Job eodBatchJob)
	{
		this.eodBatchJob=eodBatchJob;
	}
	
}
