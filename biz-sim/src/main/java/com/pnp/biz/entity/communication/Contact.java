package com.pnp.biz.entity.communication;

public class Contact {

	private long primaryPhoneNumber;
	private long secondaryPhoneNumber;
	private String primaryEmail;
	private String secondaryEmail;

	public Contact() {
		super();
	}

	public Contact(long primaryPhoneNumber, long secondaryPhoneNumber,
			String primaryEmail, String secondaryEmail) {
		super();
		this.primaryPhoneNumber = primaryPhoneNumber;
		this.secondaryPhoneNumber = secondaryPhoneNumber;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
	}

	public long getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	public void setPrimaryPhoneNumber(long primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	public long getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	public void setSecondaryPhoneNumber(long secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

}
