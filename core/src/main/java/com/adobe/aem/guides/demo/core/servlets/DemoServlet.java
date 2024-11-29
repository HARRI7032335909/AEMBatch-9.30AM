package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class,enabled = true,immediate = true)
@SlingServletResourceTypes(resourceTypes = "demo/beml/krishna")
public class DemoServlet extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {

                String fname=request.getParameter("fname");
                String lname=request.getParameter("lname");

                String fullName=fname+"  "+lname;

                response.setContentType("plain/text");

                response.getWriter().write(fullName);

        
    }

    protected void doPut(SlingHttpServletRequest request, SlingHttpServletResponse response)
    throws ServletException, IOException {

        response.getWriter().write("msg coming fromt the PUT ()");

    }

    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
    throws ServletException, IOException {

        response.getWriter().write("msg coming fromt the Post ()");

    }

    protected void doDelete(SlingHttpServletRequest request, SlingHttpServletResponse response)
    throws ServletException, IOException {

        response.getWriter().write("msg coming fromt the Delete ()");

    }

}
