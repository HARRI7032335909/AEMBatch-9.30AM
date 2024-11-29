package com.adobe.aem.guides.demo.core.models;
import java.util.Date;
import java.util.List;


import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;


@Model(adaptables = {Resource.class,SlingHttpServletRequest.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoTest implements DemoTest12{

    @RequestAttribute
    private String inputOne;

    @RequestAttribute
    private String inputTwo;

    
    @ValueMapValue
    @Default(values ="Iphone 16" )
    @Named(value = "sling:resourceType")
    private String srt ;
    @ValueMapValue
    
    private String description;
    @ValueMapValue
    private String image;
    @ValueMapValue
    private Date date;
    @ValueMapValue
    private int num;

    @ValueMapValue
    private List<String> hobby;
   

    @ScriptVariable
    Page currentPage;

    @Override
    public Date getPhoneDate() {
        // TODO Auto-generated method stub
        return date;
    }
    @Override
    public String getPhoneDescription() {
        // TODO Auto-generated method stub
        return description;
    }
    @Override
    public String getPhoneImage() {
        // TODO Auto-generated method stub
        return image;
    }
    @Override
    public int getPhoneNumber() {
        // TODO Auto-generated method stub
        return num;
    }
    @Override
    public String getPhoneTitle() {
        // TODO Auto-generated method stub
        return srt;
    }
    @Override
    public String getPhonePageTitle() {
        // TODO Auto-generated method stub
        return currentPage.getPageTitle();
    }

    public String getPhoneInputone()
    {
        return inputOne;
    }

    public String getPhoneInputTwo()
    {
        return inputTwo;
    }
    @Override
    public List<String> getPhoneUsingPersonHobbies() {
        // TODO Auto-generated method stub
        return hobby;
    }

   


}





   



