package com.fjx.dubboservice.service.impl;

import com.fjx.bubbopojo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: Fangjx
 * @Date: 16:53  2021/10/21
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("Hello Dubbo");
    }
}
