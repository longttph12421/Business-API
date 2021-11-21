package com.fis.business.dao;

import com.fis.business.entity.Product;
import com.fis.fw.common.generics.GenericDao;

import java.util.List;
import java.util.Map;

public interface ProductDao extends GenericDao<Product,Integer> {
    List<Product> getProductList(Map map);
}
