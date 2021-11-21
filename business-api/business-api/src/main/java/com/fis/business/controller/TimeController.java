package com.fis.business.controller;

import com.fis.business.entity.Time;
import com.fis.fw.common.generics.controller.GenericController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/time")
public class TimeController extends GenericController<Time, Integer> {
}
