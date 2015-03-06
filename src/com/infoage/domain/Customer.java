package com.infoage.domain;
//import java.util.Collection;

public class Customer extends Person {

	private String customerId;
	private Address shipAddress;
	private Address billAddress;
	
	public Address getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(Address shipAddress) {
		this.shipAddress = shipAddress;
	}
	public Address getBillAddress() {
		return billAddress;
	}
	public void setBillAddress(Address billAddress) {
		this.billAddress = billAddress;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	private shopingCart shopingCart;
	private Order order;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public shopingCart getShopingCart() {
		return shopingCart;
	}
	public void setShopingCart(shopingCart shopingCart) {
		this.shopingCart = shopingCart;
	}
	public Order getOrderline() {
		return order;
	}
	public void setOrderline(Order order) {
		this.order = order;
	}




}
