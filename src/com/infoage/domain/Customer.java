package com.infoage.domain;
import java.util.Collection;

public class Customer extends Person {

	private String customerId;
	private Address address;
	private ShoppingCart shopingCart;
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
	public ShoppingCart getShopingCart() {
		return shopingCart;
	}
	public void setShopingCart(ShoppingCart shopingCart) {
		this.shopingCart = shopingCart;
	}
	public Order getOrderline() {
		return order;
	}
	public void setOrderline(Order order) {
		this.order = order;
	}




}
