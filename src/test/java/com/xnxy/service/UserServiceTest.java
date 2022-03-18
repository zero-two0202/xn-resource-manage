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
        System.out.println(userService.getById(1));

    }

    @Test
    public void selectAll(){
        userService.getAll();
    }

    @Test
    public void save(){
        User user = new User();
        user.setUserUsername("xnxy");
        user.setUserPassword("xnxy");
        userService.save(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1);
        user.setUserUsername("admin");
        user.setUserPassword("123456");
        userService.update(user);
        user.setId(2);
        user.setUserUsername("root");
        user.setUserPassword("root");
        userService.update(user);
    }

    @Test
    public void delete(){
        userService.delete(3);
        userService.delete(4);
    }
}
