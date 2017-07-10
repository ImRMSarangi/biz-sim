package com.pnp.biz.entity.pricing;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentStatusEnum {

	P ("Fully Paid"),
	U ("Fully Unpaid"),
	R ("Partially Paid");
	
	private String name;
	
	private PaymentStatusEnum(String displayName) {
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
