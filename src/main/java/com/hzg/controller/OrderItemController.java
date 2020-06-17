package com.hzg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.abel533.echarts.Option;
import com.hzg.domain.OrderItem;
import com.hzg.service.OrderItemService;

@Controller
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;
	
	
	@GetMapping("/sumItem")
	@ResponseBody
	public Option sumItem(){
		System.out.println("开始计算");
		Option option= orderItemService.sumAmount();
		System.out.println(option.toString());
		
		return option;
	}
}
