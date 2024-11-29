package com.adobe.aem.guides.demo.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="TestConfiguration",description = "about TestConfiguration")
public @interface TestConfiguration {
    @AttributeDefinition(name="schedulerName",description = "about the ScherdulerName",type = AttributeType.STRING,required = true)
    public String schedulerName();

    @AttributeDefinition(name="schedulerExpression",description = "about the ScherdulerName",type = AttributeType.STRING,required = true)
    public String schedulerExpression();

    @AttributeDefinition(name="schedulerboolean",description = "about the ScherdulerName",type = AttributeType.BOOLEAN,required = true)
    public boolean scheduler_concurrent();
    @AttributeDefinition(name="schedulerenable",description = "about the ScherdulerName",type = AttributeType.BOOLEAN,required = true)
    public boolean enabled();

}
