package com.guanwanli.springcloud.controller;

import com.guanwanli.springcloud.entities.Product;
import com.guanwanli.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author:wanliguan
 * @date:2019/12/24
 * @description:
 */
@RestController
public class ProductController_Feign {

    @Autowired
    private ProductClientService service;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }
    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);

    }
    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }

}
