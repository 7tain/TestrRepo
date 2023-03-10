package com.ioc.service.impl;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s1")
public class UserServiceImpl1 implements UserService {
    @Override

    public double sum(double sum1, double sum2) {
        System.out.println("执行了加法");
        return sum1+sum2;
    }
}
