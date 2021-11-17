package com.fis.business.service;

import com.fis.business.entity.Booking;

import com.fis.fw.common.generics.GenericService;

import java.util.List;
import java.util.Map;

public interface BookingService extends GenericService<Booking,Integer> {
    Booking booking(Map map);
}
