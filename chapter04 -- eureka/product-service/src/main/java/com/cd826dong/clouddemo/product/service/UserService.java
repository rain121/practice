package com.cd826dong.clouddemo.product.service;

import com.cd826dong.clouddemo.product.api.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * Created by 11399 on 2019/4/9.
 */
@FeignClient("USERSERVICE")
public interface UserService {
    //注意请求的地址一定要与用户微服务所提供的地址一致
    @RequestMapping(value="/users",method = RequestMethod.GET)
    List<UserDto> findAll();

    //用户的主键也是通过Pathvalue的方式传递的
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    UserDto load(@PathVariable("id") Long id);
}
