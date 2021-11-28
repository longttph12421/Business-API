package com.fis.business.service;

import com.fis.business.entity.Booking;
import com.fis.business.entity.BookingDetail;
import com.fis.fw.common.generics.GenericService;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingDetailService extends GenericService<BookingDetail,Integer> {
    List<BookingDetail> findAllTimeOff();
}
