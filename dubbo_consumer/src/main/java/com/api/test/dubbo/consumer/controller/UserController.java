package com.api.test.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.dubbo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>Title:UserController</p>
 * <p>Description: </p>
 *
 * @author:duxuemei
 * @date 2019/3/11 14:56
 */
@RestController
@RequestMapping("api")
public class UserController {
    @Reference(version = "1.0.0", group = "xiaodu_test")
    private UserService service;

    @GetMapping("/users")
    public Object getUser(@RequestParam Integer id) {
        return service.getUser(id);
    }

    @GetMapping("/hi")
    public Object hi(String name) {
        return service.SayHi(name);
    }
}
