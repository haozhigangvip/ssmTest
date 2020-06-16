package com.hzg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzg.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired //自动注入
	private CompanyService companyService;
	
	@RequestMapping("/findAll")
	public String findAll(){
		System.out.println("表现层：findAll");
		companyService.findAll();
		return "list";
	}
}
