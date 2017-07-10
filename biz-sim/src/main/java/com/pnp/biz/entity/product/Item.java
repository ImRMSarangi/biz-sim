package com.pnp.biz.entity.product;

import java.util.List;

import com.pnp.biz.entity.measurement.Dimension;
import com.pnp.biz.entity.pricing.Price;

public class Item {

	private long id;
	private String name;
	private String description;
	private String image;
	private ProductCategory productCategory;
	private Price price;
	private Dimension dimension;
	private List<Discount> discounts;
}
