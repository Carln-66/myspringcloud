package com.carl.springcloud.service;

import com.carl.springcloud.entities.CommonResult;
import com.carl.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/10:00
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回，PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
