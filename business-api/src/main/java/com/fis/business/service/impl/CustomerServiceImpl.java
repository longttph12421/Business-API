package com.fis.business.service.impl;

import com.fis.business.entity.Customer;

import com.fis.business.service.CustomerService;
import com.fis.fw.common.generics.impl.GenericDaoImpl;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends GenericServiceImpl<Customer,Integer> implements CustomerService {
}
