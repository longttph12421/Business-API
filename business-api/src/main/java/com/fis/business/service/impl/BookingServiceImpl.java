package com.fis.business.service.impl;

import com.fis.business.entity.Booking;
import com.fis.business.service.BookingService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;

import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl extends GenericServiceImpl<Booking, Integer> implements BookingService {
}
