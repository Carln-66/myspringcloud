package com.carl.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/12:41
 * @Description:
 */
@Configuration
@MapperScan({"com.carl.springcloud.dao"})
public class MyBatisConfig {
}
