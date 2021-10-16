package com.fis.business.service.impl;

import com.fis.business.entity.Calender;
import com.fis.business.service.CalenderService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CalenderServiceImpl extends GenericServiceImpl<Calender, Integer> implements CalenderService {
}
