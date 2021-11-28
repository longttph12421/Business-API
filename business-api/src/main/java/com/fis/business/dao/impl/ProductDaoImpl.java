package com.fis.business.dao.impl;


import com.fis.business.dao.ProductDao;
import com.fis.business.entity.Product;
import com.fis.fw.common.generics.impl.GenericDaoImpl;

import java.util.List;
import java.util.Map;

public class ProductDaoImpl extends GenericDaoImpl<Product, Integer> implements ProductDao {
    public List<Product> getProductList(Map map) {
        String sql = "select ID id,NAME name, PRICE price, QUANTITY quantity, CREATEDATE CreateDate from PRODUCTS where" +
                "(:code is null or CODE = :code)" +
                "and (:type is null or TYPE =:type)" +
                "and (STATUS = 'ACTIVE')";
        return getByCondition(map, sql, Product.class);
    }
}
