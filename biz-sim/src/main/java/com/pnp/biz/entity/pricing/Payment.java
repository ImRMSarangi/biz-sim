package com.pnp.biz.entity.pricing;

import java.util.Date;

public class Payment {

	private Long id;
	private PaymentTypeEnum paymentType;
	private PaymentStatusEnum paymentStatus;
	private Money amount;
	private Date date;
	private String transactionId;
	
}
