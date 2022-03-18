package com.xnxy.service;

import com.xnxy.domain.User;
import com.xnxy.services.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 钟国煜
 * @creat 2022-03-17-21:38
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserServiceImpl userService;

    @Test
    public void selectById(){
        userService.getById(1);
        userService.getById(2);
        userService.getById(3);
    }

    @Test
    public void selectAll(){
        userService.getAll();
    }

    @Test
    public void save(){
        User user = new User();
        user.setUser_username("xnxy");
        user.setUser_password("xnxy");
        userService.save(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1);
        user.setUser_username("admin");
        user.setUser_password("123456");
        userService.update(user);
        user.setId(2);
        user.setUser_username("root");
        user.setUser_password("root");
        userService.update(user);
    }

    @Test
    public void delete(){
        userService.delete(3);
        userService.delete(4);
    }
}
