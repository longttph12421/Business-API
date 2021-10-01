package com.fis.business.repo;

import com.fis.business.dao.ProductDao;
import com.fis.business.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>, ProductDao {
}
