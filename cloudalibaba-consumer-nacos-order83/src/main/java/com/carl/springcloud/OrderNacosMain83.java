package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/23/10:49
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
     public static void main(String[] args) {
           SpringApplication.run(OrderNacosMain83.class, args);
      }
}
