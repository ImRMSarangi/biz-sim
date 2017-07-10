package com.pnp.biz.entity.order;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatusEnum {

	P ("Placed"),
	N ("Notified"),
	A ("Accepted"),
	C ("Packaged"),
	S ("Shipped"),
	O ("Out For Delivery"),
	D ("Delivered"),
	Q ("Return Requested"),
	R ("Returned"),
	E ("Exchange Requsted"),
	X ("Exchanged");
	
	private String name;
	
	private OrderStatusEnum(String displayName) {
		this.name = displayName;
	}

	@JsonValue
	public String getDisplayName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
