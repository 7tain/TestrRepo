package com.ioc.service.impl;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s3")
public class UserServiceImpl3 implements UserService {
    @Override

    public double sum(double sum1, double sum2) {
        System.out.println("执行了除法");
        return sum1/sum2;
    }
}
