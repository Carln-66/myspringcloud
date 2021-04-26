package com.carl.springcloud.service.impl;

import com.carl.springcloud.dao.OrderDao;
import com.carl.springcloud.domain.Order;
import com.carl.springcloud.service.AccountService;
import com.carl.springcloud.service.OrderService;
import com.carl.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/12:22
 * @Description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("======订单开始======");

        log.info("----> 开始新建订单");
        orderDao.create(order);

        log.info("----> 订单微服务开始调用库存，做扣减数量count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----> 订单调用库存扣减结束");

        log.info("----> 订单微服务开始调用账户，做扣减余额money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("----> 订单调用余额扣减结束");

        //修改订单状态，从0->1，1表示已经完成
        log.info("修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("修改订单状态结束");

        log.info("======订单结束======");
    }
}
