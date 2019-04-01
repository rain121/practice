package com.cd826dong.clouddemo.user.service.impl;

import com.cd826dong.clouddemo.user.dto.UserDto;
import com.cd826dong.clouddemo.user.entity.User;
import com.cd826dong.clouddemo.user.repository.UserRepository;
import com.cd826dong.clouddemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 11399 on 2019/3/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 使用jpa自带的分页处理方式
     * @param pageable 分页参数
     * @return
     */
    @Override
    public Page<User> getPage(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    public User load(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    @Transactional
    public User save(UserDto userDto) {
       User user= userRepository.findOne(userDto.getId());
       if(user == null){
           user=new User();
       }
       user.setNickname(userDto.getNickname());
       user.setAvatar(userDto.getAvatar());
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.delete(id);
    }
}
