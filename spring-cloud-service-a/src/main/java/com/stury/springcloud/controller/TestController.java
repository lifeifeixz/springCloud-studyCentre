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
package com.stury.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author flysLi
 * @ClassName TestController
 * @Decription TODO
 * @Date 2019/3/8 13:54
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
