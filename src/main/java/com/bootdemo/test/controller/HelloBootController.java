package com.bootdemo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBootController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}
