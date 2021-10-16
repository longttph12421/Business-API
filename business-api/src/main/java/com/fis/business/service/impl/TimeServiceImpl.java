package com.fis.business.service.impl;


import com.fis.business.entity.Time;
import com.fis.business.service.TimeService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl extends GenericServiceImpl<Time, Integer> implements TimeService {
}
