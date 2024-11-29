package com.adobe.aem.guides.demo.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Runnable.class,enabled = true,immediate = true)
@Designate(ocd=TestConfiguration.class)
public class Test implements Runnable {

    private static final Logger LOG=LoggerFactory.getLogger("Test.class");
    @Reference
    Scheduler scheduler;

    @Override
    public void run() {
       LOG.info("Test run () is running ");
        
    }

    public void activate (TestConfiguration tConfiguration)
    {
        scheduleJobs(tConfiguration);   

    }

    public void deActivate(TestConfiguration tConfiguration)
    {

    }

    public void modified(TestConfiguration tConfiguration)
    {


    }

    public void scheduleJobs(TestConfiguration tConfiguration)
    {
       if(tConfiguration.enabled())
       {
        ScheduleOptions options=scheduler.EXPR(tConfiguration.schedulerExpression());
        options.canRunConcurrently(false);
        options.name(tConfiguration.schedulerName());
        scheduler.schedule(tConfiguration, options);
        LOG.info("scheduler job");
       }
        else{
            scheduler.unschedule(tConfiguration.schedulerName());
        }

    }



}
