package com.xnxy.services;

import com.xnxy.dao.UserDao;
import com.xnxy.domain.User;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 钟国煜
 * @creat 2022-03-16-15:29
 */

public interface IUserServices {

    //根据用户id查询
    public User getById(Integer id);

    //查询所有用户信息
    public List<User> getAll();

    //保存用户信息
    public Boolean save(User user);

    //修改用户信息
    public Boolean update(User user);

    //删除用户信息
    public  Boolean delete(Integer id);



    //根据用户名字查询

    //查询用户预约记录id

}
