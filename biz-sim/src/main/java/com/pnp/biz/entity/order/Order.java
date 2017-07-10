package com.pnp.biz.entity.order;

import java.util.List;

import com.pnp.biz.entity.pricing.Payment;
import com.pnp.biz.entity.pricing.Price;
import com.pnp.biz.entity.product.Item;


public class Order {

	private long id;
	private String orderNumber;
	private List<Item> items;
	private Price price;
	private Payment payment;
	private OrderStatusEnum orderStatus;
	private OrderDetail orderDetail;
}
