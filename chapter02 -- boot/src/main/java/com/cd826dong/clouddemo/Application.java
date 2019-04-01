package com.cd826dong.clouddemo;

/**
 * Created by 11399 on 2019/3/28.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 11399 on 2019/3/15.
 * 1.Application：启动类
 * 2.@ComponentScan:（1）可以配置需要扫描的包的范围
 *                  （2）如果要扫描多个包的路径，就是使用逗号隔开eg:  com.cd826dong.** , com.cd827dong.**
 * 3.如果在系统需要进行某些初始化处理的时候，最好也是在该类中进行
 *
 */
@SpringBootApplication  //标记此注解就为启动类
@ComponentScan("com.cd826dong.**")
public class Application {// 类名是可以修改的
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}