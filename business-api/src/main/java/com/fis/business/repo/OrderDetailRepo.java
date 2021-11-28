package com.fis.business.repo;

import com.fis.business.dao.OrderDetailDao;
import com.fis.business.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail, Integer>, OrderDetailDao {

}
