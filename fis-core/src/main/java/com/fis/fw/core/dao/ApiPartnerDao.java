package com.fis.fw.core.dao;import com.fis.fw.common.generics.GenericDao;import com.fis.fw.core.entity.ApiPartner;public interface ApiPartnerDao extends GenericDao<ApiPartner,Integer> {    ApiPartner getByCode(String code);}