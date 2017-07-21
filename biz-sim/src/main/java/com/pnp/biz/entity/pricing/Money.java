package com.pnp.biz.entity.pricing;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {

	private static final int CURRENCY_CHARACTERS = 3;
	private static final int PRECISION = 19;
	private static final int SCALE = 2;

	private BigDecimal amount;
	private Currency currency;

	private Money() {
		super();
	}

	private Money(final BigDecimal amount, final Object currency) {
		super();
		this.amount = amount;
		if (currency instanceof Currency)
			this.currency = (Currency) currency;
		else if (currency instanceof String)
			this.currency = Currency.getInstance((String) currency);
	}

	public static Money newInstanceFor(final BigDecimal amount, final Object currency) {
		return new Money(amount.setScale(SCALE), currency);
	}

	public static Money newZeroFor(final Object currency) {
		return new Money(BigDecimal.ZERO.setScale(SCALE), currency);
	}

	public boolean isAmountValid(final BigDecimal amount) {
		if (amount == null)
			return false;
		return amount.scale() <= SCALE && amount.precision() <= PRECISION - SCALE + amount.scale();
	}
}
