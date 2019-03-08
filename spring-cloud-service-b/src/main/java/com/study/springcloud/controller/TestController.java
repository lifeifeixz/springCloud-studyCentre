/*
 * Copyright (c) 2018, 2018, Travel and/or its affiliates. All rights reserved.
 * TRAVEL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.study.springcloud.controller;

import com.study.springcloud.service.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author flysLi
 * @ClassName TestController
 * @Decription TODO
 * @Date 2019/3/8 13:58
 * @Version 1.0
 */
@RestController
public class TestController {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("/call")
    public String call() {
        String result = serviceAFeignClient.hello();
        return "b to a 访问结果 ----- " + result;
    }
}
