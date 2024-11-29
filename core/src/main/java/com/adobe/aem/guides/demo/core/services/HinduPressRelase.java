package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate=true)
public class HinduPressRelase {


     private static final Logger LOG=LoggerFactory.getLogger(HinduPressRelase.class);

     @Reference
     HinduArticleService hinduArticleService;

   @Activate
    public void activate()
    {
        String result=hinduArticleService.printData();
        LOG.info("HinduPressRelease activate() started");
    
        LOG.info("Result {}",result);

        
    }
    @Deactivate
    public void deactivate()
    {
        LOG.info("HinduPressRelease deactivate() started");

    }
    @Modified
    public void modify()
    {
        LOG.info("HinduPressRelease modify() started");
    }

   








}
