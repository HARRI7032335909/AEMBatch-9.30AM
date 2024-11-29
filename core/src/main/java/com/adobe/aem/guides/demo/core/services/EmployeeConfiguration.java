package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name = "EmployeeConfiguration",description = "about EmployeeConfiguration")
public @interface EmployeeConfiguration {

    @AttributeDefinition(name="empId",
    description = "about empId",
    defaultValue = "Pls Enter Emp Id",
    type=AttributeType.STRING
    )
    public int empId();


    @AttributeDefinition(name="empName",
    description = "about empName",
    defaultValue = "Pls Enter Emp Name",
    type=AttributeType.STRING
    )
    public String empName();


    @AttributeDefinition(name="empSecret",
    description = "about empSecret",
    defaultValue = "Pls Enter Emp Secret",
    type=AttributeType.STRING
    )
    public String empSecret();


    @AttributeDefinition(name="RestApi",
    description = "about empRestApi",
    defaultValue = "Pls Enter EmpRestApi",
    type=AttributeType.STRING
    )
    public String empRestApi();

}
