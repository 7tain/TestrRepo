package com.aoptest.service.impl;

import com.aoptest.service.User;
import org.springframework.stereotype.Service;

@Service("test")
public class UserImpl implements User {
    @Override
    public void say1() {
        System.out.println("hell1");
    }

    @Override
    public void say2() {
        System.out.println("hell2");
    }

    @Override
    public void say3() {
        System.out.println("hell3");
    }

    @Override
    public void say4() {
        System.out.println("hell4");
    }

    @Override
    public void say5() {
        System.out.println("hell5");
    }
}
