package com.xnxy.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xnxy.domain.User;
import com.xnxy.services.IUserServices;
import com.xnxy.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 钟国煜
 * @creat 2022-03-17-13:36
 */
@RestController
@CrossOrigin
@RequestMapping("/")
public class UserController {
    @Autowired
    IUserServices userServices;

    @GetMapping("/users/{id}")
    public User selectById(@PathVariable Integer id){
        return userServices.getById(id);
    }
    @DeleteMapping("/users/{id}")
    public Boolean delete(@PathVariable Integer id){
        return userServices.delete(id);
    }
    @PostMapping("/users")
    public Boolean save(@RequestBody User user){
        return userServices.save(user);
    }
    @PutMapping("/users")
    public Boolean update(@RequestBody User user){
        return userServices.update(user);
    }
    @GetMapping("/users")
    public List<User> select(){
        return userServices.getAll();
    }
}
