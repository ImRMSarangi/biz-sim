package com.pnp.biz.entity.actor;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ActorTypeEnum {
	
	S ("Seller"),
	C ("Customer"),
	P ("Delivery Partner"),
	D ("Delivery Addressee");
	
	private String name;

	ActorTypeEnum(String displayName) {
		this.name = displayName;
	}
	
	@JsonValue
	public String getDisplayName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}

}
