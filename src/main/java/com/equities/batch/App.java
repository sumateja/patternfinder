package com.equities.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
    public static void main( String[] args )
    {
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring/batch/jobs/equity-eod-job.xml"});
        
        System.out.println( "Hello World!" );
    	String csvFile=new BhavCopyCashMarketURLBean().getCsvFileName();

       /* JobLauncher launcher=(JobLauncher)context.getBean("jobLauncher"); 
        Job job=(Job)context.getBean("eodBatchJob");*/
    try
    {
    	
    	/*System.out.println(csvFile);
    	Map<String,JobParameter> map=new HashMap<String,JobParameter>();
    	JobParameter jobParam=new JobParameter(csvFile);
    	map.put("FILE", jobParam);
    	launcher.run(job, new JobParameters(map));*/
    }
    catch(Exception e)
    {
    	
    }
    System.out.println("DONE");
    }
    
}
