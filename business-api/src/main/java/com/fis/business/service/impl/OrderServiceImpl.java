package com.fis.business.service.impl;

import com.fis.business.entity.Orders;
import com.fis.business.service.OrderService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends GenericServiceImpl<Orders, Integer> implements OrderService {
}
