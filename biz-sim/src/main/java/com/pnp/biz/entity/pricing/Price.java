package com.pnp.biz.entity.pricing;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {

	private static final int CURRENCY_CHARACTERS = 3;
	private static final int PRECISION = 19;
	private static final int SCALE = 2;

	private BigDecimal actualPrice;
	private BigDecimal discount;
	private BigDecimal finalPrice;
	private Currency currency;
	private Tax tax;

	private Price() {
		super();
	}

	private Price(BigDecimal actualPrice, BigDecimal discount, BigDecimal finalPrice, Currency currency, Tax tax) {
		super();
		this.actualPrice = actualPrice;
		this.discount = discount;
		this.finalPrice = finalPrice;
		this.currency = currency;
	}

	public Price newInstanceFor(final String stringedActualPrice, final String stringedDiscount,
			final String stringedFinalPrice, final Currency currency, Tax tax) {
		BigDecimal bigDecActualPrice = new BigDecimal(stringedActualPrice).setScale(SCALE);
		BigDecimal bigDecDiscount = new BigDecimal(stringedDiscount).setScale(SCALE);
		BigDecimal bigDecFinalPrice = new BigDecimal(stringedFinalPrice).setScale(SCALE);
		
		return new Price(bigDecActualPrice, bigDecDiscount, bigDecFinalPrice, currency, tax);
	}

}
