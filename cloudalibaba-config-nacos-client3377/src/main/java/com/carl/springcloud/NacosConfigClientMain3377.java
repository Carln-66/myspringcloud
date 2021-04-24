package com.carl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: Carl
 * @Date: 2021/04/23/11:26
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
     public static void main(String[] args) {
           SpringApplication.run(NacosConfigClientMain3377.class, args);
      }
}
