package com.xnxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xnxy.domain.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 钟国煜
 * @creat 2022-03-17-19:51
 */
@Mapper
public interface ProductDao extends BaseMapper<Product> {
}
