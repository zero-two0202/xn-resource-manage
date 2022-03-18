package com.xnxy.services;

import com.xnxy.domain.Product;
import com.xnxy.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钟国煜
 * @creat 2022-03-17-21:30
 */

public interface IProductService {
    //根据商品id查询
    public Product getById(Integer id);

    //查询所有商品信息
    public List<Product> getAll();

    //保存商品信息
    public Boolean save(Product product);

    //修改商品信息
    public Boolean update(Product product);

    //删除商品信息
    public  Boolean delete(Integer id);
}
