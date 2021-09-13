package com.icc.config;

import com.icc.config.security.SecurityConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.icc.service", "com.icc.repository","com.icc.config.security"})
public class RootConfig{
    @Bean
    HibernateConfig hibernateConfig(){
        return new HibernateConfig();
    }
}
