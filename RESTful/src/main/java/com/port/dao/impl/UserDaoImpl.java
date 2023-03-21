package com.port.dao.impl;

import com.port.dao.UserDao;
import com.port.pojo.User;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User find(int id) {
        Map<Integer,User> map = new HashMap<>();
        map.put(1, new User(1, "张三", "gfhgjyjy23456"));
        map.put(2,new User(2, "李四", "egrt435") );
        map.put(3,new User(3, "王五", "odfsyr45")) ;
        map.put(4,new User(4, "小白", "gefgtrgv4"));
        User user = new User();
        switch (id) {
            case 1:
                user = map.get(1);
                break;
            case 2:
                user =  map.get(2);
                break;
            case 3:
                user =  map.get(3);
                break;
            case 4:
                user =  map.get(4);
                break;
        }
        return user;
    }
}



