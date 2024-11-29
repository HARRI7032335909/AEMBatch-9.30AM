package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service =PublishService.class )
public class PublishService {

    private static final Logger LOG=LoggerFactory.getLogger(PublishService.class);

    @Activate
    public void activate()
    {
        LOG.info("PublishService activate() excution started");
    }
    @Deactivate
    public void deActivate()
    {
        LOG.info("PublishService Deactivate() excution started");
    }
     @Modified
    public void update()
    {
        LOG.info("PublishService update() excution started");
    }

    public String printData()
    {
       return "Data coming from the printData() available in PublisService";  
    }

}
