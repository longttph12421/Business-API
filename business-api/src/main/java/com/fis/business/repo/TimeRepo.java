package com.fis.business.repo;

import com.fis.business.dao.TimeDao;
import com.fis.business.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepo extends JpaRepository<Time, Integer>, TimeDao {
}
