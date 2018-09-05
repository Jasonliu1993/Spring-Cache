package com.springcache.springcache.service;

import com.springcache.springcache.dao.UserDao;
import com.springcache.springcache.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Cacheable(value = "common", key = "#id")
    public User getUserById(String id){
        System.out.println("++++++++++++++++run to here");
        return userDao.getUserById(id);
    }

    public void saveUser(String id, User user) {
        userDao.saveUser(id,user);
    }

}
