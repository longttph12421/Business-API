package com.fis.business.controller;

import com.fis.business.entity.Customer;
import com.fis.business.service.CustomerService;
import com.fis.fw.common.generics.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/customer")
public class CustomerController extends GenericController<Customer, Integer> {

}
