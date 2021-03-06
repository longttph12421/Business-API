package com.fis.business.repo;


import com.fis.business.dao.BookingDetailDao;
import com.fis.business.entity.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDetailRepo extends JpaRepository<BookingDetail,Integer>, BookingDetailDao {


}
