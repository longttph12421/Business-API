package com.fis.business.repo;

import com.fis.business.dao.OrderDao;
import com.fis.business.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer>, OrderDao {
}
