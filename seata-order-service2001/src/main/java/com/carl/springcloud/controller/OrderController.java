package com.carl.springcloud.controller;

import com.carl.springcloud.domain.CommonResult;
import com.carl.springcloud.domain.Order;
import com.carl.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/12:37
 * @Description:
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }

}
