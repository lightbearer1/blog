package com.application.blog.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

/**
 * 作者:wyq
 * 日期:2022/6/5 1:13
 * 描述:SpringSecurity配置类 5.4.x以上新用法配置
 *    为避免循环依赖，仅用于配置HttpSecurity
 */
@Configuration
public class UserSecurityConfig extends WebSecurityConfigurerAdapter {

    //采用链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll();
    }


    /*@Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .antMatcher("/**")
                .authorizeRequests(authorize -> authorize
                        .anyRequest().authenticated()
                )
                .build();
    }*/


}


