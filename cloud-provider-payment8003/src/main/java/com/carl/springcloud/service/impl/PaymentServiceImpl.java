package com.carl.springcloud.service.impl;

import com.carl.springcloud.dao.PaymentDao;
import com.carl.springcloud.entities.Payment;
import com.carl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Carl
 * @Date: 2021/04/14/11:09
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
