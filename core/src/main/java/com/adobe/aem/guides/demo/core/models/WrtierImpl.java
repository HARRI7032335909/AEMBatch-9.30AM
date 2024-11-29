package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables =Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WrtierImpl {
    
    @ValueMapValue
    private String text;
    @ValueMapValue
    private long number;
    @ValueMapValue
    private String date;
    @ValueMapValue
    private String image;

    public String getText() {
        return text;
    }
    public long getNumber() {
        return number;
    }
    public String getDate() {
        return date;
    }
    public String getImage() {
        return image;
    }

}
