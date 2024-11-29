package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(service =BankAccountHolder.class,immediate = true,enabled = true )
@Designate(ocd =BankAccountHolderConfiguration.class )
public class BankAccountHolder {

    private static final Logger LOG=LoggerFactory.getLogger(BankAccountHolder.class);
    private String holderName;

    private int  accountNumber;

    
    
    private String restApi;
    @Activate
    void activate(BankAccountHolderConfiguration configuration)
    {
        LOG.info("activate() excuted");

        update(configuration);
    }
     @Deactivate
    void deActivate(BankAccountHolderConfiguration configuration)
    {
        LOG.info("deactivate() excuted");

    }
   @Modified
    void modified(BankAccountHolderConfiguration configuration)
    {
        LOG.info("modified() excuted");
    }

    void update(BankAccountHolderConfiguration configuration)
    {
        this.holderName=configuration.holderName();    //instance variables intialization 
        
        this.accountNumber=configuration.accountNumber();

        this.restApi=configuration.restApi();

        LOG.info("holderName is : {}, accountNumber is {}, restApi is {}",holderName,accountNumber,restApi);
    }

}
