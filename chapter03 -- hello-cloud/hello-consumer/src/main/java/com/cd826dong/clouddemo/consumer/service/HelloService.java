package com.cd826dong.clouddemo.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 11399 on 2019/3/29.
 * FeignClient:通过Feign的子项目来实现这个接口，属于springcloud所提供的Feign子项目实现的。
 * HP-SERVICE：表示具体的服务名称
 *HelloServiceFallback.class:表示所调用的微服务不可用时，使用该类提供的功能能替代原本的服务，也就是springcloud的容错功能
 */
//这是一个远程hello服务客户端，用来调用HelloConsumer所提供的服务
@FeignClient(value = "HP-SERVICE", fallback = HelloServiceFallback.class)//当前服务不可以使用时，HelloServiceFallback代替
public interface HelloService {
    @RequestMapping(value = "/hello-provider/{name}", method = RequestMethod.GET)//根据这个请求先做处理，如果异常则再走HelloServiceFallback
    public String hello(@PathVariable("name") String name);
}