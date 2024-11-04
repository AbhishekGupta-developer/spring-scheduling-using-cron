package com.myorganisation.demoSpringSchedulingAndCron.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobScheduler {

    @Scheduled(cron = "*/5 * * * * *")
    public void cronJobScheduler() {
        System.out.println("Hello world...");
    }
}
