package com.fis.business.service.impl;

import com.fis.business.entity.Users;
import com.fis.business.service.UserService;
import com.fis.fw.common.generics.impl.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<Users,String> implements UserService {
}
