package com.adobe.aem.guides.demo.core.handler;

import org.apache.sling.api.SlingConstants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(service =EventHandler.class,immediate = true,

property = {EventConstants.EVENT_TOPIC+"=org/apache/sling/api/resource/Resource/*"})
public class DemoHandler implements EventHandler {

    private static final Logger LOG=LoggerFactory.getLogger(DemoHandler.class);

    @Override
    public void handleEvent(Event event) {

        LOG.info("Event Topic ={}, path {}",event.getTopic());
        event.getProperty(SlingConstants.PROPERTY_PATH);
       
        
    }

}
