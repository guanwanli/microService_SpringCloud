package com.guanwanli.springcloud.service.impl;

import com.guanwanli.springcloud.entities.Product;
import com.guanwanli.springcloud.service.ProductClientService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author:wanliguan
 * @date:2019/12/25
 * @description:
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService {
    @Override
    public Product get(Long id) {
        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }
}
