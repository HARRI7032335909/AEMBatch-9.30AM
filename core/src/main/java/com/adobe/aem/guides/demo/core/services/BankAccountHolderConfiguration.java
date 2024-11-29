package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name = "BankAccountHolderConfiguration", description = "About BankAccountHolderConfiguration")
public @interface BankAccountHolderConfiguration {

   @AttributeDefinition(name = "krishna",
   description = "about holderName",
   defaultValue = "krishna",
    type=AttributeType.STRING)
    String holderName();

    @AttributeDefinition(name = "98798987",
   description = "about acountNumber",
   defaultValue = "9898087098",
    type=AttributeType.INTEGER)
    int accountNumber();

    @AttributeDefinition(name = "www.hdfc.com",
    description = "about bank details",
    defaultValue = "9999999",
     type=AttributeType.INTEGER)
     String restApi();

}
