package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/17/14:36
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZKMain80.class, args);
      }
}
