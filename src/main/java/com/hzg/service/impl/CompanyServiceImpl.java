package com.hzg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzg.dao.CompanyDao;
import com.hzg.domain.Company;
import com.hzg.service.CompanyService;

//添加Service注解，并起名为"companyService"
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public List<Company> findAll(){
		List<Company> ls=null;
		try {
			ls=companyDao.findAll();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("业务层：findAll");
		return ls;
	}
	
	@Override
	public Integer saveCompany(Company company){
		Integer res=0;
		return res;
	}
}
