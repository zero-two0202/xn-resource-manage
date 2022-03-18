package com.xnxy.dao;

import com.xnxy.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 钟国煜
 * @creat 2022-03-16-15:02
 */
@SpringBootTest
public class DamainTest {

    @Autowired
    private UserDao userDao;
    @Test
    void testGetById(){
        userDao.selectById(1);
    }
}
