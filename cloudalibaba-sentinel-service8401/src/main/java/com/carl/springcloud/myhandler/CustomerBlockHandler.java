package com.carl.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.carl.springcloud.entities.CommonResult;

/**
 * @Auther: Carl
 * @Date: 2021/04/25/8:49
 * @Description:
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按客户自定义，global --- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按客户自定义，global --- 2");
    }
}
