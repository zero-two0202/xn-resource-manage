package com.xnxy.dao;

import com.xnxy.domain.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 钟国煜
 * @creat 2022-03-17-20:42
 */
@SpringBootTest
public class ProductTest {
    @Autowired
    ProductDao productDao;

    @Test
    public void getById(){
        productDao.selectById(1);
    }
    @Test
    public void save(){
        Product product = new Product();
        product.setP_desc("羽毛球");
        productDao.insert(product);
    }

    @Test
    public void update(){
        Product product = new Product();
        product.setId(3);
        product.setP_desc("乒乓球");
        productDao.updateById(product);
    }

}
