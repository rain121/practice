package com.cd826dong.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 11399 on 2019/4/3.
 * 用户服务
 */


@EnableDiscoveryClient  //这个是业务处理的服务
//@EnableEurekaServer  这是治理服务器的服务
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
