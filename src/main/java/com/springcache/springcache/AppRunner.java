package com.springcache.springcache;

import com.springcache.springcache.entity.User;
import com.springcache.springcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {

        userService.saveUser("18521370425", new User(123, "张三", 18));
        userService.saveUser("18521370426", new User(456, "李四", 18));
        System.out.println(userService.getUserById("18521370425"));
        System.out.println(userService.getUserById("18521370425"));
        System.out.println(userService.getUserById("18521370426"));
        System.out.println(userService.getUserById("18521370426"));

    }

}
