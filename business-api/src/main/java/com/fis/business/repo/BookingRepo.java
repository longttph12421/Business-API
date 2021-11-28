package com.fis.business.repo;

import com.fis.business.dao.BookingDao;
import com.fis.business.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer>, BookingDao {
}
