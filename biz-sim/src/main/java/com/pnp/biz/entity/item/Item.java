package com.pnp.biz.entity.item;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.pnp.biz.entity.measurement.Dimension;
import com.pnp.biz.entity.pricing.Price;
import com.pnp.biz.entity.pricing.Tax;

public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "CATEGORY")
	private ProductCategory productCategory;
	
	private Price price;
	
	private Tax tax;
	
	private Dimension dimension;
	
	@OneToMany
	@JoinColumn(name = "ID")
	private List<Discount> discounts;
}
