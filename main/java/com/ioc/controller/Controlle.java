package com.ioc.controller;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
@Controller
public class Controlle {
    private UserService userService;

    @Autowired
    @Qualifier("s1")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public double sum(){

        return userService.sum(3,2);
    }
}
