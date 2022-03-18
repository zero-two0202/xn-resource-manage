package com.xnxy.service;

import com.xnxy.domain.Product;
import com.xnxy.domain.User;
import com.xnxy.services.impl.ProductServiceImpl;
import com.xnxy.services.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 钟国煜
 * @creat 2022-03-18-9:23
 */
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    ProductServiceImpl productService;

    @Test
    public void selectById(){
        System.out.println(productService.getById(1));

    }

    @Test
    public void selectAll(){
        productService.getAll();
    }

    @Test
    public void save(){
        Product product = new Product();
        product.setPDesc("台球");

        productService.save(product);
    }

    @Test
    public void update(){
        Product product = new Product();
        product.setId(5);
        product.setPDesc("网球");
        productService.update(product);
    }

    @Test
    public void delete(){
        productService.delete(6);
    }
}
