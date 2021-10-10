package com.iservport.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.{EnableWebSecurity, WebSecurityConfigurerAdapter}

@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter {

  @throws[Exception]
  override protected def configure(http: HttpSecurity): Unit =
    http.authorizeRequests.antMatchers("/*").permitAll.and.csrf.disable
}
