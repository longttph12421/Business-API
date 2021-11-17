package com.fis.business.dao;

import com.fis.business.entity.Booking;
import com.fis.fw.common.generics.GenericDao;

import java.util.List;
import java.util.Map;

public interface BookingDao extends GenericDao<Booking,Integer> {
    List<Booking> saveBooking(Map map);
}
