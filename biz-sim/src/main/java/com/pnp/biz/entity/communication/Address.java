package com.pnp.biz.entity.communication;

public class Address {

	private long id;
	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String district;
	private String state;
	private String country;
	private long pinCode;
	private GPSCoordinate gpsCoordinate;// Google geo coding will be used

	public Address() {
		super();
	}

	public Address(long id, String line1, String line2, String line3,
			String city, String district, String state, String country,
			long pinCode, GPSCoordinate gpsCoordinate) {
		super();
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.gpsCoordinate = gpsCoordinate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public GPSCoordinate getGpsCoordinate() {
		return gpsCoordinate;
	}

	public void setGpsCoordinate(GPSCoordinate gpsCoordinate) {
		this.gpsCoordinate = gpsCoordinate;
	}

}
