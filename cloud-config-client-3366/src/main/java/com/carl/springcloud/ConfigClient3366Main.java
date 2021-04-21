package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/21/10:57
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366Main {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClient3366Main.class, args);
      }
}
