package com.adobe.aem.guides.demo.core.impl;
import java.util.Date;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.demo.core.models.HclPage;
import com.day.cq.wcm.api.Page;
@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HclImpl implements HclPage{
      @ValueMapValue
      private String text;
      @ValueMapValue 
      private String number;
      @ValueMapValue
      private Date date;
      @ValueMapValue
      private String image;

      @ScriptVariable
      Page currentPage;

    @Override
    public String getimagePath() {
        // TODO Auto-generated method stub
        return image;
    }

    @Override
    public String getarticleNumber() {
        // TODO Auto-generated method stub
        return number;
    }

    @Override
    public String getpageTitle() {
        // TODO Auto-generated method stub
        return currentPage.getPageTitle();

    }
        

    @Override
    public String getarticleText() {
        // TODO Auto-generated method stub
        return text;
    }

    @Override
    public Date getdatePicker() {
        // TODO Auto-generated method stub
        return date;
    }

 

}
