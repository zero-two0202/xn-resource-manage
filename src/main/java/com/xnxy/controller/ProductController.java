package com.xnxy.controller;

import com.xnxy.domain.Product;
import com.xnxy.domain.User;
import com.xnxy.pojo.ResultList;
import com.xnxy.services.IProductService;
import com.xnxy.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 钟国煜
 * @creat 2022-03-17-19:52
 */
@RestController
@CrossOrigin
@RequestMapping("/")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("/products/{id}")
    public Product selectById(@PathVariable Integer id){
        return productService.getById(id);
    }
    @DeleteMapping("/products/{id}")
    public Boolean delete(@PathVariable Integer id){
        return productService.delete(id);
    }
    @PostMapping("/products")
    public Boolean save(@RequestBody Product product){
        return productService.save(product);
    }
    @PutMapping("/products")
    public Boolean update(@RequestBody Product product){
        return productService.update(product);
    }
    @GetMapping("/products")
    public List<Product> select(){
        return productService.getAll();
    }
}
