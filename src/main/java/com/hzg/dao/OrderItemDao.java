package com.hzg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hzg.domain.OrderItem;

@Repository
public interface OrderItemDao {
	@Select ("select currency,sum(amount) as amount from item group by currency")
	public List<OrderItem>  sumAmount();
	
}
