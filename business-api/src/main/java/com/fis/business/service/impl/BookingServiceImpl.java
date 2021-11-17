package com.fis.business.service.impl;

import com.fis.business.entity.Booking;
import com.fis.business.entity.Customer;
import com.fis.business.repo.BookingRepo;
import com.fis.business.repo.CustomerRepo;
import com.fis.business.service.BookingService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookingServiceImpl extends GenericServiceImpl<Booking, Integer> implements BookingService {
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Booking booking(Map map) {
        if(map.isEmpty()) {
            Customer customer = new Customer();
            customer.setFullname(map.get("FULL_NAME").toString());
            customerRepo.save(customer);
        }
        return null;
    }
}
