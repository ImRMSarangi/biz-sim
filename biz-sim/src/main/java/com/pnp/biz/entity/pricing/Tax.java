package com.pnp.biz.entity.pricing;

import java.math.BigDecimal;

public class Tax {

	private BigDecimal cgstPercentage;
	private BigDecimal sgstPercentage;
	private BigDecimal igstPercentage;

	private Tax() {
		super();
	}

	public Tax(BigDecimal cgstPercentage, BigDecimal sgstPercentage, BigDecimal igstPercentage) {
		super();
		this.cgstPercentage = cgstPercentage;
		this.sgstPercentage = sgstPercentage;
		this.igstPercentage = igstPercentage;
	}

	public BigDecimal getCgstPercentage() {
		return cgstPercentage;
	}

	public void setCgstPercentage(BigDecimal cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}

	public BigDecimal getSgstPercentage() {
		return sgstPercentage;
	}

	public void setSgstPercentage(BigDecimal sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}

	public BigDecimal getIgstPercentage() {
		return igstPercentage;
	}

	public void setIgstPercentage(BigDecimal igstPercentage) {
		this.igstPercentage = igstPercentage;
	}

}
