package com.xnxy.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xnxy.dao.ProductDao;
import com.xnxy.domain.Product;
import com.xnxy.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钟国煜
 * @creat 2022-03-17-21:32
 */
@Service
public class ProductServiceImpl  implements IProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public Product getById(Integer id) {
        return productDao.selectById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDao.selectList(null);
    }

    @Override
    public Boolean save(Product product) {
        return productDao.insert(product) > 0;
    }

    @Override
    public Boolean update(Product product) {
        return productDao.updateById(product) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return productDao.deleteById(id) > 0;
    }
}
