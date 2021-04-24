package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/23/10:39
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain9002.class, args);
      }
}
