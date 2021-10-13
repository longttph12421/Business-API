package com.fis.business.controller;

import com.fis.business.entity.Staff;
import com.fis.business.service.StaffService;
import com.fis.fw.common.generics.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/staff")
public class StaffController extends GenericController<Staff,Integer> {
    @Autowired
    StaffService staffService;
}
