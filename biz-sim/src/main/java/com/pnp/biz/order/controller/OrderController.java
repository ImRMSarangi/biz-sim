package com.pnp.biz.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pnp.biz.entity.order.Order;
import com.pnp.biz.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Order placeOrder(Order order) {
		
		return order;
	}
}
