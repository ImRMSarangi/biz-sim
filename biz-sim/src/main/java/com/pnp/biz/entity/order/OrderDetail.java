package com.pnp.biz.entity.order;

import java.util.Date;

import com.pnp.biz.entity.actor.Actor;

public class OrderDetail {

	private long id;
	private Actor placedBy;
	private Date placedOn;
	private Actor deliveryTo;
	private Actor acceptedBy;
	private Date acceptedOn;
	private Actor deliveredBy;
	private Date deliveredOn;
}
