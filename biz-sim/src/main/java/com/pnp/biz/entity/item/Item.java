package com.pnp.biz.entity.item;

import java.util.List;

import com.pnp.biz.entity.measurement.Dimension;
import com.pnp.biz.entity.pricing.Price;
import com.pnp.biz.entity.pricing.Tax;

public class Item {

	private Long id;
	private String name;
	private String description;
	private String image;
	private ProductCategory productCategory;
	private Price price;
	private Tax tax;
	private Dimension dimension;
	private List<Discount> discounts;
}
