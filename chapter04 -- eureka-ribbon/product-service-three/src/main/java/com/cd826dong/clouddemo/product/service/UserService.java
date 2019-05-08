package com.cd826dong.clouddemo.product.service;

import com.cd826dong.clouddemo.product.api.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 11399 on 2019/4/12.
 */
@FeignClient("USERSERVICE") //微服务的服务名
public interface UserService {

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    List<UserDto> findAll();

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    UserDto load(@PathVariable("id") Long id);


}
