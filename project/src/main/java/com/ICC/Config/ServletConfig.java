package com.ICC.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.ICC.Controller")
public class ServletConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        // Register resource handler for -

        // IMAGES
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/resources/images/");

        // CSS
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/css/");

        // JAVASCRIPT
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/js/");
    }
}
