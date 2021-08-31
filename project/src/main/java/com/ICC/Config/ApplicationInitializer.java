package com.ICC.Config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        rootContext.refresh();
        servletContext.addListener(new ContextLoaderListener(rootContext));

        AnnotationConfigWebApplicationContext servletRegisterer = new AnnotationConfigWebApplicationContext();
        servletRegisterer.register(ServletConfig.class);
        ServletRegistration.Dynamic registration = servletContext.addServlet("servlet",
                new DispatcherServlet(servletRegisterer));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
