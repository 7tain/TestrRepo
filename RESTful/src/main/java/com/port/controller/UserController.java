package com.port.controller;

import com.port.pojo.User;
import com.port.returndata.UserReturnDate;
import com.port.service.UserService;
import com.port.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/use")
public class UserController {
    @Autowired
    private UserService userService;
   /* @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    @GetMapping("/{id}")

    public UserReturnDate find(@PathVariable int id){
      User user= userService.find(id);
        UserReturnDate usedate=new UserReturnDate();
        usedate.setStatue(200);
        usedate.setInfo("成功");
        usedate.setUser(user);
        return usedate;
    }
}
