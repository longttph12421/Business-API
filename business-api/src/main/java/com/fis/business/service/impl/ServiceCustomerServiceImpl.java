package com.fis.business.service.impl;

import com.fis.business.entity.ServiceCustomer;
import com.fis.business.service.ServiceCustomerService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ServiceCustomerServiceImpl extends GenericServiceImpl<ServiceCustomer, Integer> implements ServiceCustomerService {
}
