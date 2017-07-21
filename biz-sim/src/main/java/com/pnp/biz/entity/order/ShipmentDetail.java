package com.pnp.biz.entity.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SHIPMENT_DETAIL", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class ShipmentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@OneToMany
	@JoinColumn(name = "SHIPMENT_ID")
	private OrderDetail orderDetail;
	
	@Column(name = "TRACKING_NUMBER")
	private String trackingNumber;
	
	@Column(name = "ACCEPTED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Date shipmentDate;

}
