package com.port.service.impl;

import com.port.dao.UserDao;
import com.port.dao.impl.UserDaoImpl;
import com.port.pojo.User;
import com.port.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
   /* @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public User find(int id) {
        return  userDao.find(id);
       }
    }

