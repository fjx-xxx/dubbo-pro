package com.fjx.dubboweb.controller;

import com.fjx.bubbopojo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Fangjx
 * @Date: 16:54  2021/10/21
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/sayhello")
    public String sayHello(){
        userService.sayHello();
        return "hello";
    }
}
