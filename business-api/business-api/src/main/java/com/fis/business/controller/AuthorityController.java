package com.fis.business.controller;

import com.fis.fw.common.generics.controller.GenericController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/authority")
public class AuthorityController extends GenericController<Authority, Integer> {
}
