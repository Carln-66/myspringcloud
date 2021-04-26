package com.carl.springcloud.service;

import com.carl.springcloud.domain.Order;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/12:22
 * @Description:
 */
public interface OrderService {
    void create(Order order);
}
