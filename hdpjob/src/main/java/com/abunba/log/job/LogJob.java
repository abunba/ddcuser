package com.abunba.log.job;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Lazy(false)
public class LogJob   {
	
	private  static Logger logger = Logger.getLogger(LogJob.class);

//    @Scheduled(cron = "0 30 0 * * ?")
    @Scheduled(cron = "0,30,59 * * * * ?")
    public void synRecipeCount() {
    	System.out.println("ppppp");
		
    }


}
