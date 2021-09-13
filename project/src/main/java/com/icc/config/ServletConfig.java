package com.icc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.icc.controller")
public class ServletConfig implements WebMvcConfigurer {
    @Autowired
    ApplicationContext applicationContext;

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry){
//
//        //registry.jsp("/WEB-INF/views/", ".jsp");
//    }

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


    //1. Creating SpringResourceTemplateResolver
    @Bean
    public SpringResourceTemplateResolver springTemplateResolver(){
        SpringResourceTemplateResolver springTemplateResolver = new SpringResourceTemplateResolver();
        springTemplateResolver.setApplicationContext(this.applicationContext);
        springTemplateResolver.setPrefix("/WEB-INF/views/");
        springTemplateResolver.setSuffix(".html");
        return springTemplateResolver;
    }

    //2. Creating SpringTemplateEngine
    @Bean
    public SpringTemplateEngine springTemplateEngine(){
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(springTemplateResolver());
        return springTemplateEngine;
    }


    //3. Registering ThymeleafViewResolver
    @Bean
    public ViewResolver viewResolver(){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(springTemplateEngine());
        return viewResolver;
    }

}
