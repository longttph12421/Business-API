package com.fis.business.service.impl;

import com.fis.business.entity.Staff;
import com.fis.business.service.StaffService;
import com.fis.fw.common.generics.impl.GenericDaoImpl;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl extends GenericServiceImpl<Staff,Integer> implements StaffService {

}
