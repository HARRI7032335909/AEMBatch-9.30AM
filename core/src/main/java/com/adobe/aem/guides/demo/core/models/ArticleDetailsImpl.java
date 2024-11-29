package com.adobe.aem.guides.demo.core.models;

import java.util.Date;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;
@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticleDetailsImpl implements ArticleDetails {

    @ScriptVariable
    Page currentPage;


    @ValueMapValue
    private String text;
     @ValueMapValue
    private long number;
    @ValueMapValue
    private Date date;
    @ValueMapValue
    private String image;

    @Override
    public Date getArticleDate() {
        // TODO Auto-generated method stub
        return date;
    }

    @Override
    public String getArticleImage() {
        // TODO Auto-generated method stub
        return image;
    }

    @Override
    public long getArticleNumber() {
        // TODO Auto-generated method stub
        return number;
    }

    @Override
    public String getArticleText() {
        // TODO Auto-generated method stub
        return text;
    }

    @Override
    public String getArticlePageTitle() {
        // TODO Auto-generated method stub
        return currentPage.getPageTitle();
    }

}
