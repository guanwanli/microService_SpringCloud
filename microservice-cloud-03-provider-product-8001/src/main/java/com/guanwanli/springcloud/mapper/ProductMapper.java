package com.guanwanli.springcloud.mapper;

import com.guanwanli.springcloud.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:wanliguan
 * @date:2019/12/24
 * @description:
 */
@Repository
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
