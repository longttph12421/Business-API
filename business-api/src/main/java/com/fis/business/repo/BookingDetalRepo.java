package com.fis.business.repo;

import com.fis.business.dao.BookingDetailDao;
import com.fis.business.entity.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetalRepo extends JpaRepository<BookingDetail,Integer>, BookingDetailDao {
}
