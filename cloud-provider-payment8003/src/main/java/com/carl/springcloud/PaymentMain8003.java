package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/15/12:10
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8003 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8003.class, args);
      }
}
