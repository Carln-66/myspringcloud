package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/20/13:07
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {
     public static void main(String[] args) {
           SpringApplication.run(GatewayMain9527.class, args);
      }
}
