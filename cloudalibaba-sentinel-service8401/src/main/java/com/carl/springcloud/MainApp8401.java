package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/24/14:49
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
     public static void main(String[] args) {
           SpringApplication.run(MainApp8401.class, args);
      }
}
