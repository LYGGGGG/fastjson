package com.y.controller;

/*
@author YG
@create 2022/11/17   13:48
*/

import com.y.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class FastJsonController {
    @RequestMapping(value = "/getJson",produces = "text/plain;charset=UTF-8")
    public User getJson(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(22);
        user.setCreateTime(new Date());
        return user;
    }
}
