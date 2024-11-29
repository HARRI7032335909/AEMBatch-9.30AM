package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,enabled = true)
public class HclService {

    private static final Logger LOG=LoggerFactory.getLogger(HclService.class);

    @Activate
    public void activate()
    {
        LOG.info("HclService activate() started");
    }
    @Deactivate
    public void deActivate()
    {
        LOG.info("HclService activate() End");
    }
    @Modified
    public void update()
    {
        LOG.info("HclService activate() update");
    }

}
