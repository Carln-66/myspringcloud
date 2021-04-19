package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: Carl
 * @Date: 2021/04/19/12:28
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients //激活并开启feign
public class OrderFeignMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderFeignMain80.class, args);
      }
}
