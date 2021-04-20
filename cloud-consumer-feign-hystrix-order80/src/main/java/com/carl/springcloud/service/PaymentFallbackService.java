package com.carl.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: Carl
 * @Date: 2021/04/20/10:37
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "=== PaymentFallbackService fall back === OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "=== PaymentFallbackService fall back === Timeout";
    }
}
