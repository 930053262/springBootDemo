package com.bootdemo.test;

import com.bootdemo.test.bean.UserBean;
import com.bootdemo.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserBean userBean = userService.loginIn("张三","666666");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
