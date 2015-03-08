package com.infoage.domain;
import java.util.Collection;

public class Customer extends Person {

	private String customerId;
	private Address address;
	private shopingCart shopingCart;
	private Order order;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Address getAdress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
