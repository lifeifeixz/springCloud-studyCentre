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
package com.study.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author flysLi
 * @ClassName ServiceAFeignClient
 * @Decription TODO
 * @Date 2019/3/8 13:57
 * @Version 1.0
 */
@FeignClient("SERVICE-OBJECT-A")
public interface ServiceAFeignClient {

    @RequestMapping("/hello")
    public String hello();
}
