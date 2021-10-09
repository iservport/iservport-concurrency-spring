package com.iservport.concurrency

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = Array("com.iservport.config"))
class Application

object Application {

  def main(args: Array[String]): Unit =
    SpringApplication run classOf[Application]
}
