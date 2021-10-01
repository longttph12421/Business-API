package com.fis.business.controller;

import com.fis.business.entity.Product;
import com.fis.business.service.ProductService;
import com.fis.fw.common.config.CoreConstants;
import com.fis.fw.common.dto.MessagesResponse;
import com.fis.fw.common.generics.controller.GenericController;
import com.fis.fw.common.utils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/product")
public class ProductController extends GenericController<Product, Integer> {
    @Autowired
    ProductService productService;

    @RequestMapping(value = {"/getProductList"}, method = RequestMethod.POST)
    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    public @ResponseBody
    ResponseEntity<?> getProductList(@RequestBody Map map) {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "getProductList", startTime);
        MessagesResponse msg = new MessagesResponse();
        try {
            msg.setData(productService.getProductList(map));
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "getProductList", startTime);
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @RequestMapping(value = {"/getAllProduct"}, method = RequestMethod.GET)
    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    public @ResponseBody
    ResponseEntity<?> getAll() {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "getProductList", startTime);
        MessagesResponse msg = new MessagesResponse();
        try {
            msg.setData(productService.findAll());
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "getProductList", startTime);
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
