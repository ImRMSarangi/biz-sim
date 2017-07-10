package com.pnp.biz.entity.pricing;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentTypeEnum {

	N ("Net Banking"),
	D ("Debit Card"),
	C ("Credit Card"),
	S ("Cash On Delivery"),
	E ("EMI"),
	W ("Digital Wallet");	
	
	private String name;
	
	private PaymentTypeEnum(String displayName) {
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
