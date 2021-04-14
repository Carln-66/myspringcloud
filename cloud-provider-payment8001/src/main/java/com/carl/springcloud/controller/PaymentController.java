package com.carl.springcloud.controller;

import com.carl.springcloud.entities.CommonResult;
import com.carl.springcloud.entities.Payment;
import com.carl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Auther: Carl
 * @Date: 2021/04/14/11:11
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("---插入结果" + payment);
        if (result > 0)  {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("---查询结果" + payment);
        if (payment != null)  {
            return new CommonResult(200, "查询成功啦！", payment);
        } else {
            return new CommonResult(444, "无对应ID：" + id, null);
        }
    }
}
