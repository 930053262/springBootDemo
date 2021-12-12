package com.bootdemo.test.service.impl;

import com.bootdemo.test.bean.UserBean;
import com.bootdemo.test.mapper.UserMapper;
import com.bootdemo.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
