package com.adobe.aem.guides.demo.core.models;

import java.util.Date;
import java.util.List;

public interface Test {


    public String getNttTitle();

    public String getNttDescription();

    public String getNttImage();

    public int getNttNumber();

    public Date getNttPublishDate();

    public List<String> getMultifield();

    public String getCurrentPageName();


    public String getPageCreatedPersonName();

 

}
