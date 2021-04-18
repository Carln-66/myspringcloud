package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/17/13:53
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于向consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8005 {
     public static void main(String[] args) {
           SpringApplication.run(PaymentMain8005.class, args);
      }
}
