package com.bootdemo.test.mapper;

import com.bootdemo.test.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);
}
