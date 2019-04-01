package com.cd826dong.clouddemo.consumer.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by 11399 on 2019/3/29.
 *  服务降级实现
 */
@Component
public class HelloServiceFallback implements HelloService {
    public String hello(String name) {
        return "Hello, " + name + ", I'm fallback!";
    }
}
