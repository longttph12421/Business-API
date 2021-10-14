package com.fis.business.repo;

import com.fis.business.dao.StaffDao;
import com.fis.business.entity.Staff;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>, StaffDao {
}
