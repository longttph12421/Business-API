package com.fis.business.controller;

import com.fis.business.entity.Users;
import com.fis.business.service.UserService;
import com.fis.fw.common.generics.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest/user")
public class UserController extends GenericController<Users,String> {
    @Autowired
    UserService userService;
}
