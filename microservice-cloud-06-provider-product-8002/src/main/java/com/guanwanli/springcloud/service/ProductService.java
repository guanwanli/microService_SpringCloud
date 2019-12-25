package com.guanwanli.springcloud.service;

import com.guanwanli.springcloud.entities.Product;

import java.util.List;

/**
 * @author:wanliguan
 * @date:2019/12/24
 * @description:
 */

public interface ProductService {
    boolean add(Product product);
    Product get(Long id);
    List<Product> list();

}
