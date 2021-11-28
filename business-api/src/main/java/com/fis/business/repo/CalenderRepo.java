package com.fis.business.repo;

import com.fis.business.dao.CalenderDao;
import com.fis.business.entity.Calender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalenderRepo extends JpaRepository<Calender, Integer>, CalenderDao {
}
