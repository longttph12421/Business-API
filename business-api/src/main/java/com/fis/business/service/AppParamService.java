package com.fis.business.service;import com.fis.fw.common.generics.GenericService;import com.fis.business.entity.AppParam;import java.util.List;import java.util.Map;public interface AppParamService extends GenericService<AppParam, Integer> {    List<AppParam> getByCodeType(Map map);    boolean existsCode(String code, String type);    String getValue(String code, String type);}