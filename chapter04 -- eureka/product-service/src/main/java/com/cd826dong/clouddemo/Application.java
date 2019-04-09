package com.cd826dong.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 11399 on 2019/4/3.
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.cd826dong.clouddemo.product.service.**")  //开启Feign服务
public class Application {
//    @Bean(value = "restTemplate")
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
