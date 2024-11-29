package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(immediate = true)
public class Demo {

    private static final Logger LOG=LoggerFactory.getLogger(Demo.class);
   @Activate
    void activate()
    {
        LOG.info("activate() method excution started");
    }
  @Deactivate
    void deactivate()
    {
        LOG.info("deactivate() method excution started");
    }
 @Modified
    void update()
    {
        LOG.info("modified() method excution started");
    }

}
