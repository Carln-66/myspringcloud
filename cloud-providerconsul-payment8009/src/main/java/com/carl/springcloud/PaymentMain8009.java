package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/18/10:45
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8009 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8009.class, args);
      }
}
