package com.guanwanli.springcloud.service.impl;

import com.guanwanli.springcloud.entities.Product;
import com.guanwanli.springcloud.mapper.ProductMapper;
import com.guanwanli.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wanliguan
 * @date:2019/12/24
 * @description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }
    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }
    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
