package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="StudentConfiguration.clas",description = "about student")
public @interface StudentConfiguration {


    @AttributeDefinition(name="Raju",description = "about the raju",defaultValue = "raju",type = AttributeType.STRING)
    public String studenName();
    @AttributeDefinition(name="100",description = "about the raju id",defaultValue = "rajuid",type = AttributeType.INTEGER)
    public int studentId();
    @AttributeDefinition(name="Raju",description = "about the raju",defaultValue = "raju",type = AttributeType.STRING)
    public String studentSecret();

    @AttributeDefinition(name="Raju",description = "about the raju",defaultValue = "raju",type = AttributeType.STRING)
    public String studentRestApi();

}
