package com.safronov.spring.security.configuration;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.builder();

        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("zaur").password("{noop}zaur").roles("EMPLOYEE"))
                .withUser(userBuilder.username("elena").password("{noop}elena").roles("HR"))
                .withUser(userBuilder.username("ivan").password("{noop}ivan").roles("MANAGER", "HR"));
    }
}
