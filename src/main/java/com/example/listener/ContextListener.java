package com.example.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;
@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        LocalDateTime now = LocalDateTime.now();
        context.setAttribute("servletTimeInit", now);
        System.out.println("Context initialized at: " + now);
    }


}