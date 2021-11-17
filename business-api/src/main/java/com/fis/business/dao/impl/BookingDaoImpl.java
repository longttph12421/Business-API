package com.fis.business.dao.impl;

import com.fis.business.dao.BookingDao;
import com.fis.business.entity.Booking;
import com.fis.fw.common.generics.impl.GenericDaoImpl;

import java.util.List;
import java.util.Map;

public class BookingDaoImpl extends GenericDaoImpl<Booking,Integer> implements BookingDao {
    @Override
    public List<Booking> saveBooking(Map map) {

        return null;
    }
}
