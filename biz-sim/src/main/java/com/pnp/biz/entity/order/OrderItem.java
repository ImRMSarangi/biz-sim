package com.pnp.biz.entity.order;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pnp.biz.entity.item.Discount;
import com.pnp.biz.entity.item.Item;
import com.pnp.biz.entity.pricing.Price;

public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ID")
	private Order order;
	
	@OneToOne
	@JoinColumn(name = "ID")
	private Item item;
	
	private Price price;
	
	@OneToMany
	@JoinColumn(name = "ID")
	private List<Discount> discounts;
}
