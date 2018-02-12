package com.springcache.springcache.dao;

import com.springcache.springcache.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserDao {

    private static ConcurrentHashMap<String, User> concurrentHashMap = new ConcurrentHashMap<>();

    public Collection<User> getAll() {
       return  concurrentHashMap.values();
    }

    public User getUserById(String id){
        return concurrentHashMap.get(id);
    }

    public void saveUser(String id, User user) {
        concurrentHashMap.put(id,user);
    }

    public User deleteUser(User user) {
        return concurrentHashMap.remove(user);
    }

    public void deleteAll() {
        concurrentHashMap.clear();
    }

}
