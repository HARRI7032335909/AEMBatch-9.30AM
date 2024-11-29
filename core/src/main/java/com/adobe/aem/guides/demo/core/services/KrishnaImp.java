package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = KrishnaImp.class,enabled = true,immediate = true)
@Designate(ocd=StudentConfiguration.class)
public class KrishnaImp {

    private static final Logger LOG=LoggerFactory.getLogger(KrishnaImp.class);

    private String studentName;

    private int studentId;

    private String studentSecret;

    private String restApi;

    @Activate
    public void activate(StudentConfiguration studentConfiguration)
   
    {
        LOG.info("Data coming fromt the StudentImpl");
        update(studentConfiguration);
    }
    @Deactivate
    public void DeActivate(StudentConfiguration studentConfiguration)
    {

    }
    @Modified
    public void modified(StudentConfiguration studentConfiguration)
   {

    }
    public void update(StudentConfiguration studentConfiguration)
    {
                                this.studentName= studentConfiguration.studenName();
                                LOG.info("studentName{}",studentName);
    }

    }

    

    




