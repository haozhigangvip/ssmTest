package com.hzg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hzg.domain.Company;

@Repository
public interface CompanyDao {
	
	@Select("select * from company_info")
	public List<Company> findAll();
	
//	@Insert("insert into company_info (name,money) values (#{name},#{money})")
//	public void saveCompany (Company company);
	
}
