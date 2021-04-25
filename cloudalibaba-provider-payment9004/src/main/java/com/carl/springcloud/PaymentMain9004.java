package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/9:07
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9004.class, args);
      }
}
