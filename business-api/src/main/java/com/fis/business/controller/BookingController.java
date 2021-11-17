package com.fis.business.controller;

import com.fis.business.entity.Booking;
import com.fis.business.service.BookingService;
import com.fis.business.service.CustomerService;
import com.fis.fw.common.dto.MessagesResponse;
import com.fis.fw.common.generics.controller.GenericController;
import com.fis.fw.common.utils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/booking")
public class BookingController extends GenericController<Booking, Integer> {

    @Autowired
    CustomerService custommerService;

    @Autowired
    BookingService bookingService;

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<?> booking(@RequestBody Map map) {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "booking", startTime);
        MessagesResponse msg = new MessagesResponse();
        try {
            // msg.setData(productService.getProductList(map));
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "booking", startTime);
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
