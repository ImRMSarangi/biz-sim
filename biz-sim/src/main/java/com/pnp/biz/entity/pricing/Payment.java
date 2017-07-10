package com.pnp.biz.entity.pricing;

import java.util.Date;

public class Payment {

	private long id;
	private PaymentTypeEnum paymentType;
	private PaymentStatusEnum paymentStatus;
	private Price price;
	private Date date;
	private String transactionId;
	
}
