package com.pnp.biz.entity.communication;

public class GPSCoordinate {
	private String lattitude;
	private String longitude;

	public GPSCoordinate() {
		super();
	}

	public GPSCoordinate(String lattitude, String longitude) {
		super();
		this.lattitude = lattitude;
		this.longitude = longitude;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
