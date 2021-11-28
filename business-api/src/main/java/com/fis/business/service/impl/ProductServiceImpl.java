package com.fis.business.service.impl;

import com.fis.business.entity.Product;
import com.fis.business.repo.ProductRepo;
import com.fis.business.service.ProductService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Integer> implements ProductService {
    @Override
    public List<Product> getProductList(Map map) {
        return ((ProductRepo) getRepository()).getProductList(map);
    }

}
