package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service=UserDetails.class,enabled = true,immediate = true)
@Designate(ocd=UserDetailsCofigurations.class)
public class UserDetails {

    private static final Logger LOG=LoggerFactory.getLogger("UserDetails.class");

    private String userName;

    private int userId;

    private String userSecret;

    private String userApi;
    @Activate
    public void activate(UserDetailsCofigurations userDetailsCofigurations){
       update(userDetailsCofigurations);  
       LOG.info("Data coming UserDetails class");
    }
   @Deactivate
    public void deactivate(UserDetailsCofigurations userDetailsCofigurations)
    {
        LOG.info("Data coming UserDetails class deactivate");
    }
    @Modified
    public void modified(UserDetailsCofigurations userDetailsCofigurations)
    {
        LOG.info("Data coming UserDetails class modified");
    }

    public void update(UserDetailsCofigurations userDetailsCofigurations)
    {
        this.userName=userDetailsCofigurations.userName();  //instance variables initialization

        this.userId=userDetailsCofigurations.userId();

        this.userSecret=userDetailsCofigurations.userSecret();

        this.userApi=userDetailsCofigurations.userApi();

        LOG.info("userName{}, userId {}, userSecret{} , userApi{}",userName ,userId,userSecret,userApi);
    }

}
