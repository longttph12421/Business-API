package com.fis.business.service.impl;

import com.fis.business.entity.Booking;
import com.fis.business.entity.BookingDetail;
import com.fis.business.service.BookingDetailService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BookingDetailSerImpl extends GenericServiceImpl<BookingDetail,Integer> implements BookingDetailService {
}