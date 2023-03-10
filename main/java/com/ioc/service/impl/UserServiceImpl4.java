package com.ioc.service.impl;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s4")
public class UserServiceImpl4 implements UserService {
    @Override

    public double sum(double sum1, double sum2) {
        System.out.println("执行了乘法");
        return sum1*sum2;
    }
}
