package com.icc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.icc.service", "com.icc.repository"})
public class RootConfig{
    @Bean
    HibernateConfig hibernateConfig(){
        return new HibernateConfig();
    }
}
