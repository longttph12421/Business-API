package com.fis.business.controller;

import com.fis.business.entity.Category;
import com.fis.business.service.CategoryService;
import com.fis.fw.common.config.CoreConstants;
import com.fis.fw.common.dto.MessagesResponse;
import com.fis.fw.common.generics.controller.GenericController;
import com.fis.fw.common.utils.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/Category")
public class CategoryController extends GenericController<Category, String> {
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = {"/getAllCategory"}, method = RequestMethod.GET)
    @PreAuthorize("@appAuthorizer.authorize(authentication, '" + CoreConstants.PRIVILEGE.VIEW + "', this)")
    public @ResponseBody
    ResponseEntity<?> getAll() {
        long startTime = System.currentTimeMillis();
        LogUtil.showLog(logger, LogUtil.LOG_BEGIN, "getProductList", startTime);
        MessagesResponse msg = new MessagesResponse();
        try {
            msg.setData(categoryService.findAll());
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } finally {
            LogUtil.showLog(logger, LogUtil.LOG_END, "getProductList", startTime);
        }
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
