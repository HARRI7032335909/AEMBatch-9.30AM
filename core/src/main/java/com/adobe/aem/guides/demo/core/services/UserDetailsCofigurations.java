package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="UserDetailsCofigurations",description = "About UserDetailsCofigurations")
public @interface UserDetailsCofigurations {
    @AttributeDefinition(name = "UserName",
    description = "about user Description",
    defaultValue = "raju",
    type=AttributeType.STRING,
    required = true)
    public String userName();

    @AttributeDefinition(name = "UserID",
    description = "about userId Description",
    defaultValue = "1011",
    type=AttributeType.INTEGER,
    required = true)
    public int userId();


    @AttributeDefinition(name = "UserSecret",
    description = "about userSecret Description",
    defaultValue = "999999",
    type=AttributeType.STRING,
    required = true)
    public String userSecret();


    @AttributeDefinition(name = "UserApi",
    description = "about userApi Description",
    defaultValue = "www.surge.com",
    type=AttributeType.STRING,
    required = true)
    public String userApi();



}
