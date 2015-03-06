package com.infoage.domain;
import java.util.Collection;

public class Customer extends Person {

	private String customerId;
	private Collection<Adress> adress;
	private shopingCart shopingCart;
	private Order order;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Collection<Adress> getAdress() {
		return adress;
	}
	public void setAdress(Collection<Adress> adress) {
		this.adress = adress;
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
