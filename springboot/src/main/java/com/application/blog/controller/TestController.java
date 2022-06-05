package com.application.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者:wyq
 * 日期:2022/6/5 13:49
 * 描述: 控制器测试类
 */
@RestController
@RequestMapping("/test")
public class TestController {

        @RequestMapping("/hello")
        public String hello() {
            return "hello";
        }
}
