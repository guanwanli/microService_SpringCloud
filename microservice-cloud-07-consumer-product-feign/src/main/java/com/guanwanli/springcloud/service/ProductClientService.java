package com.guanwanli.springcloud.service;

import com.guanwanli.springcloud.entities.Product;
import com.guanwanli.springcloud.service.impl.ProductClientServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MICROSERVICE-PRODUCT", fallback =
        ProductClientServiceFallBack.class)
@Component
public interface ProductClientService {
    @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
    Product get(Long id);
    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    List<Product> list();
    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    boolean add(Product product);

}
