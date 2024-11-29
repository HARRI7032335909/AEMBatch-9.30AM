package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service=PersonDetails.class,enabled = true,immediate = true)
@Designate(ocd = PersonConfiguration.class)
public class PersonDetails {

     private static final Logger LOG=LoggerFactory.getLogger(PersonDetails.class);

    private String PersonName;

    private String PersonId;

    private String PersonRestApi;
    @Activate
    public void activate(PersonConfiguration PersonConfiguration )
    {
        LOG.info("activate() Person Details");

        updatValue(PersonConfiguration);

    }
     @Deactivate
    public void deActivate(PersonConfiguration PersonConfiguration )
    {
        LOG.info("Deactivate() Person Details");
        updatValue(PersonConfiguration);

    }
     @Modified
    public void modify(PersonConfiguration PersonConfiguration )
    {
        LOG.info("modify() Person Details");
        updatValue(PersonConfiguration);

    }

     public void updatValue(PersonConfiguration PersonConfiguration )
     {
                            this.PersonName= PersonConfiguration.personName();
                            this.PersonId=PersonConfiguration.personId();
                            this.PersonRestApi=PersonConfiguration.personRestAPi();

                            LOG.info("PersonName {} , personId {} , PersonApi{}"+ PersonName, PersonId,PersonRestApi);
     }


}
