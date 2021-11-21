package com.fis.business.service.impl;

import com.fis.business.entity.Booking;
import com.fis.business.entity.BookingDetail;
import com.fis.business.service.BookingDetailService;
import com.fis.business.service.BookingService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingDetailSerImpl extends GenericServiceImpl<BookingDetail, Integer> implements BookingDetailService {
    @Override
    public List<BookingDetail> findAllTimeOff() {
        return null;
    }
//    @Override
//    public List<BookingDetail> findAllTimeOff() {
//        String query = "select customers.fullname,customers.phone,service_customer.name,staffs.fullname,time_end,time_start,booking_details.status from  bookings inner join booking_details on \n" +
//                "booking_details.booking_id=bookings.id inner join service_customer on service_customer.id=booking_details.service_id inner join staffs on staffs.id = bookings.id_staff\n" +
//                "inner join customers on customers.id=bookings.id_customer";
//
//    }
}
