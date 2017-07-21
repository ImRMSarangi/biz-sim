package com.pnp.biz.entity.order;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.pnp.biz.entity.item.Discount;
import com.pnp.biz.entity.pricing.Money;
import com.pnp.biz.entity.pricing.Payment;

@Entity
@Table(name = "ORDER", uniqueConstraints = { @UniqueConstraint(columnNames = { "ORDER_NUMBER" }) })
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "ORDER_NO", length = 20, nullable = false)
	private String orderNumber;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	private List<OrderItem> items;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discount")
	private List<Discount> discounts;

	@Column(name = "DISCOUNT_PRICE")
	private Money discountPrice;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "payment")
	private Payment payment;

	@Column(name = "ORDER_STATUS", nullable = false)
	private OrderStatusEnum orderStatus;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	private OrderDetail orderDetail;

	private Order() {
		super();
	}

	private Order(Long id, String orderNumber, List<OrderItem> items, List<Discount> discounts, Money discountPrice,
			Payment payment, OrderStatusEnum orderStatus, OrderDetail orderDetail) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.items = items;
		this.discounts = discounts;
		this.discountPrice = discountPrice;
		this.payment = payment;
		this.orderStatus = orderStatus;
		this.orderDetail = orderDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public List<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public Money getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Money discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public OrderStatusEnum getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusEnum orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

}
