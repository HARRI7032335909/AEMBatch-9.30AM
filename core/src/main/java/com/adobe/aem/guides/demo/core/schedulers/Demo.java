package com.adobe.aem.guides.demo.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service =Demo.class,immediate = true,enabled = true )
@Designate(ocd=DemoConfig.class)
public class Demo implements Runnable{
    @Reference
    Scheduler scheduler;

    private static final Logger LOG=LoggerFactory.getLogger(Demo.class);

    @Override
    public void run()
     {
        
        LOG.info("Demo class run() calling");  
    }
    @Activate
    void activate(DemoConfig config)
    {
        sheduleJobs(config);
    }
    @Deactivate
    void deActivate(DemoConfig config)
    {
        sheduleJobs(config);
    }
     @Modified
    void modified(DemoConfig config)
    {
        sheduleJobs(config);
    }


    void sheduleJobs(DemoConfig config)
    {
        if(config.enabled())
        {
            ScheduleOptions options=scheduler.EXPR(config.schedulerExpressions());
            options.canRunConcurrently(false);
            options.name(config.schedulerName());
            scheduler.schedule(this, options);
            LOG.info("sheduler job");
        }
        else
        {
            scheduler.unschedule(config.schedulerName());
        }
         
         
    }

}
