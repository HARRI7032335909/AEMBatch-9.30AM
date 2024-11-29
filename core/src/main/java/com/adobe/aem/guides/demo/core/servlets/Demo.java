package com.adobe.aem.guides.demo.core.servlets;


import java.io.IOException;

import javax.servlet.Servlet;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
@Component(service =Servlet.class,enabled = true,immediate = true)
@SlingServletPaths(value ="/bin/dummu/text")
public class Demo extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException
  {
      response.getWriter().write("dummy");
 }
   
    

}
