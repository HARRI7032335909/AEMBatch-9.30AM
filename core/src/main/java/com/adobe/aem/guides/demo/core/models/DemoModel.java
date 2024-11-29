package com.adobe.aem.guides.demo.core.models;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},  defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel {

    public void init()
    {
        String name="hello world";
    }

   
}





    
    




