package com.pnp.biz.entity.measurement;

public class Unit {

	private String name;
	private String displayName;

	public Unit() {
		super();
	}

	public Unit(String name, String displayName) {
		super();
		this.name = name;
		this.displayName = displayName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
