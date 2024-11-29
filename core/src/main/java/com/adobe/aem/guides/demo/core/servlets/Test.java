package com.adobe.aem.guides.demo.core.servlets;


import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
@Component(service =Servlet.class,immediate = true)
@SlingServletResourceTypes(resourceTypes = "demo/article")
public class Test extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
                response.getWriter().write ("Data coming from the doGet() using pathe based servlet"); 
      
    }

    



}
