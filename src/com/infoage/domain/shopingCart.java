package com.infoage.domain;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class shopingCart {

	private Collection<OrderLine> orderdItem;
	private Date creationDate;
	private double price;
	
	public Collection<OrderLine> getOrderdItem() {
		return orderdItem;
	}
	public void setOrderdItem(Collection<OrderLine> orderdItem) {
		this.orderdItem = orderdItem;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addCartItem(OrderLine item) {
		orderdItem.add(item);
		updateGrandTotal();
	}
	public void removeCartItem(OrderLine item) {
		orderdItem.remove(item);
		updateGrandTotal();
	}

	public void updateGrandTotal() {
		double totalPrice = 0D;
		Iterator<OrderLine> it = orderdItem.iterator();
		while (it.hasNext()) {
			OrderLine currentLineItem = it.next();
			totalPrice = totalPrice + currentLineItem.getPrice();
		}
		this.price = totalPrice;
	}

}
