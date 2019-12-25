package com.guanwanli.springcloud.controller;

import com.guanwanli.springcloud.entities.Product;
import com.guanwanli.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:wanliguan
 * @date:2019/12/24
 * @description:
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product vo = productService.get(id);
        return vo;
    }
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
