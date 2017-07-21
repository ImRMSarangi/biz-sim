package com.pnp.biz.entity.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.pnp.biz.entity.actor.Actor;

@Entity
@Table(name = "ORDER_DETAIL", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ORDER_ID", nullable = false)
	private Order order;

	@Column(name = "PLACED_BY")
	private Actor placedBy;

	@Column(name = "PLACED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Date placedOn;

	@Column(name = "DELIVERY_TO")
	private Actor deliveryTo;

	@Column(name = "ACCEPTED_BY")
	private Actor acceptedBy;

	@Column(name = "ACCEPTED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Date acceptedOn;

	@Column(name = "SHIPPED_BY")
	private Actor shippedBy;

	@Column(name = "SHIPPED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Date shippedOn;

	@Column(name = "DELIVERED_BY")
	private Actor deliveredBy;

	@Column(name = "DELIVERED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Date deliveredOn;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderDetail")
	private ShipmentDetail shipmentDetail;

	private OrderDetail() {
		super();
	}

	private OrderDetail(Long id, Order order, Actor placedBy, Date placedOn, Actor deliveryTo, Actor acceptedBy,
			Date acceptedOn, Actor shippedBy, Date shippedOn, Actor deliveredBy, Date deliveredOn,
			ShipmentDetail shipmentDetail) {
		super();
		this.id = id;
		this.order = order;
		this.placedBy = placedBy;
		this.placedOn = placedOn;
		this.deliveryTo = deliveryTo;
		this.acceptedBy = acceptedBy;
		this.acceptedOn = acceptedOn;
		this.shippedBy = shippedBy;
		this.shippedOn = shippedOn;
		this.deliveredBy = deliveredBy;
		this.deliveredOn = deliveredOn;
		this.shipmentDetail = shipmentDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrderId(Order order) {
		this.order = order;
	}

	public Actor getPlacedBy() {
		return placedBy;
	}

	public void setPlacedBy(Actor placedBy) {
		this.placedBy = placedBy;
	}

	public Date getPlacedOn() {
		return placedOn;
	}

	public void setPlacedOn(Date placedOn) {
		this.placedOn = placedOn;
	}

	public Actor getDeliveryTo() {
		return deliveryTo;
	}

	public void setDeliveryTo(Actor deliveryTo) {
		this.deliveryTo = deliveryTo;
	}

	public Actor getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(Actor acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	public Date getAcceptedOn() {
		return acceptedOn;
	}

	public void setAcceptedOn(Date acceptedOn) {
		this.acceptedOn = acceptedOn;
	}

	public Actor getShippedBy() {
		return shippedBy;
	}

	public void setShippedBy(Actor shippedBy) {
		this.shippedBy = shippedBy;
	}

	public Date getShippedOn() {
		return shippedOn;
	}

	public void setShippedOn(Date shippedOn) {
		this.shippedOn = shippedOn;
	}

	public Actor getDeliveredBy() {
		return deliveredBy;
	}

	public void setDeliveredBy(Actor deliveredBy) {
		this.deliveredBy = deliveredBy;
	}

	public Date getDeliveredOn() {
		return deliveredOn;
	}

	public void setDeliveredOn(Date deliveredOn) {
		this.deliveredOn = deliveredOn;
	}

	public ShipmentDetail getShipmentDetail() {
		return shipmentDetail;
	}

	public void setShipmentDetail(ShipmentDetail shipmentDetail) {
		this.shipmentDetail = shipmentDetail;
	}

}
