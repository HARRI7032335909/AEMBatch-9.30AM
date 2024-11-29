package com.adobe.aem.guides.demo.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="DemoConfig",description = "about demo configurations")
public @interface DemoConfig {
 @AttributeDefinition(name = "schedulerName",description = "about schedulerName")
    String schedulerName();
    @AttributeDefinition(name = "schedulerExpressions",description = "about schedulerExpressions")
    String schedulerExpressions()default "*/5 * * * * ?";
    @AttributeDefinition(name = "schedulerconcurent",description = "about schedulerconcurent")
    boolean scheduler_concurrent() default false;
    @AttributeDefinition(name = "enable",description = "about enable")
    boolean enabled() default true;

}
