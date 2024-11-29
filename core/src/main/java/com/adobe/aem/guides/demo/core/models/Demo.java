package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Demo {
     @ValueMapValue
    private String  nttTitle;
     @ValueMapValue
    private String des;
      @ValueMapValue
    private String nttimage;

    public String getNttTitle() {
        return nttTitle;
    }

    public String getDes() {
        return des;
    }

    public String getNttimage() {
        return nttimage;
    }

    

}
