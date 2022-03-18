package com.xnxy.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xnxy.dao.UserDao;
import com.xnxy.domain.User;
import com.xnxy.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钟国煜
 * @creat 2022-03-17-21:23
 */
@Service
public class UserServiceImpl implements IUserServices {
    @Autowired
    UserDao userDao;

    //根据id查询
    @Override
    public User getById(Integer id) {
        return userDao.selectById(id);
    }

    //查询所有的用户数据
    @Override
    public List<User> getAll() {
        return userDao.selectList(null);
    }

    //添加用户信息
    @Override
    public Boolean save(User user) {
        return userDao.insert(user) > 0;
    }
    //修改用户信息，根据用户的id修改
    @Override
    public Boolean update(User user) {
        return userDao.updateById(user) > 0;
    }

    //根据用户id删除用户的信息
    @Override
    public Boolean delete(Integer id) {
        return userDao.deleteById(id) > 0;
    }
}
