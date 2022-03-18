package com.xnxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xnxy.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 钟国煜
 * @creat 2022-03-16-14:55
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
