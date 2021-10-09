package com.iservport.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EntityScan(Array("com.iservport.*.domain"))
@ComponentScan(basePackages = Array("com.iservport.*.service", "com.iservport.*.controller"))
@EnableJpaRepositories(basePackages = Array("com.iservport.*.repository"))
class Config {
}