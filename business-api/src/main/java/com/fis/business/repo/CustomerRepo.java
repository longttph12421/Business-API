package com.fis.business.repo;

import com.fis.business.dao.CustomerDao;
import com.fis.business.entity.Customer;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>, CustomerDao {

}
