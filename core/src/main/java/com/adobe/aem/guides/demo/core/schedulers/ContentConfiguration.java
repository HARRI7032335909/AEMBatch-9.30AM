package com.adobe.aem.guides.demo.core.schedulers;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="ContentConfiguration",description = "about the content")
public @interface ContentConfiguration {
     @AttributeDefinition(name="schedulerName",description = "about the scheduler name",defaultValue = "ContenExpiryDate")
    public String schedulerName();

    @AttributeDefinition(name="schedulerExpression",description = "about the schedulerExpression",defaultValue = "*/5 * * * * ?")
    public String schedulerExpression();

    @AttributeDefinition(name="schedulerName",description = "about the scheduler name")
     boolean scheduler_concurrent() default false ;

    @AttributeDefinition(name="schedulerName",description = "about the scheduler name",defaultValue = "ContenExpiryDate")
    public boolean enabled() default true;

}
