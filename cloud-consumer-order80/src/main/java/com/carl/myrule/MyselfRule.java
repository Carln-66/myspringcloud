package com.carl.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Carl
 * @Date: 2021/04/18/12:34
 * @Description:
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();    //随机
    }
}
