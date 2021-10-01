package com.fis.business.service.impl;

import com.fis.business.entity.Category;
import com.fis.business.service.CategoryService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category,String> implements CategoryService {
}
