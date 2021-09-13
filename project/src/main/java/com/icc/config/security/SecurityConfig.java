package com.icc.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
            .withUser("admin")
            .password("{noop}admin")
            .roles("ADMIN");
    }

    @Override
    public void configure(HttpSecurity https) throws Exception{

        https
                .authorizeRequests()
                // Following line denotes that all requests must be authenticated.
                // Hence, once a request comes to our application, we will check if the user is authenticated or not.
                .anyRequest().authenticated()

                // Here we are configuring our login form
                .and()
                .formLogin()
                .permitAll() // We re permitting all for login page
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/")// If the login is successful, user will be redirected to this URL.
                .failureForwardUrl("/login");
    }

}
