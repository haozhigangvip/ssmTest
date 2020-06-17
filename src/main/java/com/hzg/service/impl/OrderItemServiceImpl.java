package com.hzg.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Pie;
import com.hzg.dao.OrderItemDao;
import com.hzg.domain.OrderItem;
import com.hzg.service.OrderItemService;


@Service
public class OrderItemServiceImpl  implements  OrderItemService{
	@Autowired
	private OrderItemDao orderItemDao;
	
	@Override
	public Option sumAmount(){
		 List<OrderItem> list=new ArrayList<OrderItem>();
			Option option=new Option();

		try {
			list=orderItemDao.sumAmount();
			option.title("销售额按货币分布").tooltip(Trigger.axis).legend("金额（元）");
			option.xAxis(new ValueAxis().boundaryGap(0d, 0.01));
			CategoryAxis category = new CategoryAxis();
		    Pie pie = new Pie("金额（元）");
		    Bar bar = new Bar("金额（元）");
		    for (OrderItem orderItem : list) {
		    	  category.data(orderItem.getCurrency());
		          bar.data(orderItem.getAmount());
		    	 pie.data(new PieData(orderItem.getCurrency(), orderItem.getAmount()));
			}
		    option.yAxis(category);
		    pie.center(900,380).radius(100);
		    option.series(bar, pie);
		    option.grid().x(180);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return option;
	
	 }
	 
}
