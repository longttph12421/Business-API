package com.fis.business.repo;

import com.fis.business.dao.ServiceCustomerDao;
import com.fis.business.entity.ServiceCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCustomerRepo extends JpaRepository<ServiceCustomer, Integer>, ServiceCustomerDao {
}
