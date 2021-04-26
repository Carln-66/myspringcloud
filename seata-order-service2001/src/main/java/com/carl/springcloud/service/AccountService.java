package com.carl.springcloud.service;

import com.carl.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/12:23
 * @Description:
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/drease")
    CommonResult decrease(@RequestParam("uerId") Long userId, @RequestParam("money") BigDecimal count);
}
