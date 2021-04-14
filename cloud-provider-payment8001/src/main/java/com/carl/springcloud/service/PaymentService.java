package com.carl.springcloud.service;

import com.carl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: Carl
 * @Date: 2021/04/14/11:09
 * @Description:
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
