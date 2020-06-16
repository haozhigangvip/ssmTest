package com.hzg.service;

import java.util.List;

import com.hzg.domain.Company;

public interface CompanyService {

	public List<Company> findAll();
	public Integer saveCompany(Company company);
}
