package com.bootdemo.test.service;

import com.bootdemo.test.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);
}
