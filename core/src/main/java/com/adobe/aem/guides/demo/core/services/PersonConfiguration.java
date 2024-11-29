package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name = "PersonConfiguration",description = "about Person Configuration")
public @interface PersonConfiguration {
   @AttributeDefinition(name="PersonName",
    description = "about Person",
    defaultValue = "Pls Enter personName",
     type = AttributeType.STRING)
    public String personName ();

    @AttributeDefinition(name="Personid",
    description = "about PersonId",
    defaultValue = "Pls Enter personId",
     type = AttributeType.STRING)
    public String personId ();


    @AttributeDefinition(name="PersonName",
    description = "about PersonRestapi",
    defaultValue = "Pls Enter personRestApi",
     type = AttributeType.STRING)
    public String personRestAPi ();



}
