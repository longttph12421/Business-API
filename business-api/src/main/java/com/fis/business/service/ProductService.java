package com.fis.business.service;

import com.fis.business.entity.Product;
import com.fis.fw.common.generics.GenericService;

import java.util.List;
import java.util.Map;

public interface ProductService extends GenericService<Product, Integer> {
    List<Product> getProductList(Map map);

}
