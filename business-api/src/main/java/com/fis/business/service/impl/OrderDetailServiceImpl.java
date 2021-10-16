package com.fis.business.service.impl;


import com.fis.business.entity.OrderDetail;
import com.fis.business.service.OrderDetailService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends GenericServiceImpl<OrderDetail, Integer> implements OrderDetailService {

}
