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

@Component(service = Runnable.class,enabled = true,immediate = true)
@Designate(ocd =ContentConfiguration.class )
public class CotentExpiryDate implements Runnable{

    private static final Logger LOG=LoggerFactory.getLogger("CotentExpiryDate.class");

    @Reference
    Scheduler scheduler;

    @Override
    public void run() {

        LOG.info("ContentExpiryDate run() excuting ");

        
    }
    @Activate
    public void activate(ContentConfiguration configuration)
    {
        updateExpiryDates(configuration);
    }
    @Deactivate
    public void deActivate(ContentConfiguration configuration)
    {
        updateExpiryDates(configuration);

    }
     @Modified
    public void modified(ContentConfiguration configuration)
    {
        updateExpiryDates(configuration);
    }

    public void updateExpiryDates(ContentConfiguration configuration)
    {
      if(configuration.enabled()) 
      {
        ScheduleOptions options=scheduler.EXPR(configuration.schedulerExpression());
            options.canRunConcurrently(false);
            options.name(configuration.schedulerName());

        scheduler.schedule(this, options) ; 
      }  
      else{
        scheduler.unschedule(configuration.schedulerName());
      }      
    }


}
