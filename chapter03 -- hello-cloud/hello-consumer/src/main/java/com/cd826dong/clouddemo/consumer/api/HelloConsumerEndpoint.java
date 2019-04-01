package com.cd826dong.clouddemo.consumer.api;

import com.cd826dong.clouddemo.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 11399 on 2019/3/29.
 */
@RestController
@RequestMapping("/hello")
public class HelloConsumerEndpoint {
    @Autowired
    private HelloService helloService;

    /**
     * Hello
     * @return
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name){

        return this.helloService.hello(name);
    }
}
