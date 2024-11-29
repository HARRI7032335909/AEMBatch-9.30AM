package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service =HinduArticleService.class ,immediate = true,enabled = true)
public class HinduArticleService {

    private static final Logger LOG=LoggerFactory.getLogger(HinduArticleService.class);

   @Activate
    public void activate()
    {
        LOG.info("HinduArticleService activate() started");
    }
    @Deactivate
    public void deactivate()
    {
        LOG.info("HinduArticleService deactivate() started");

    }
    @Modified
    public void modify()
    {
        LOG.info("HinduArticleService modify() started");
    }

    public String printData()
    {
      return "print data of HinduPressRelease" ; 
    }



}
