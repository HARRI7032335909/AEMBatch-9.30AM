package com.adobe.aem.guides.demo.core.models;

import java.util.Date;
import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;

@Model(adaptables ={Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TestModel implements Test {
     @ValueMapValue
   public  String nttTitle;
      @ValueMapValue
   public String des;
   @ValueMapValue
   public String nttimage;
   @ValueMapValue
   public int number;
   @ValueMapValue
   public Date datepicker;

   @ValueMapValue
   public List<String> tech;

   @ValueMapValue
    @Named(value = "jcr:createdBy")
   public String adminName;

   @ScriptVariable
    Page currentPage;
@Override
public String getNttDescription() {
    // TODO Auto-generated method stub
    return des;
}
@Override
public String getNttImage() {
    // TODO Auto-generated method stub
    return nttimage;
}
@Override
public int getNttNumber() {
    // TODO Auto-generated method stub
    return number;
}
@Override
public Date getNttPublishDate() {
    // TODO Auto-generated method stub
    return datepicker;
}
@Override
public String getNttTitle() {
    // TODO Auto-generated method stub
    return nttTitle;
}
@Override
public String getCurrentPageName() {
    // TODO Auto-generated method stub
    return currentPage.getTitle();
}
@Override
public List<String> getMultifield() {
    // TODO Auto-generated method stub
    return tech;
}
@Override
public String getPageCreatedPersonName() {
    // TODO Auto-generated method stub
    return adminName;
}


}
