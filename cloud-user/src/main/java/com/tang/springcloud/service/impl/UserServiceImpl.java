package com.tang.springcloud.service.impl;

import com.tang.springcloud.dao.UserMapper;
import com.tang.springcloud.entity.User;
import com.tang.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.getUserById(id);
    }
}
