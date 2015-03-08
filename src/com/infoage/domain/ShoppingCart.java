package com.infoage.domain;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class ShoppingCart {

	private Collection<OrderdBook> orderdItem;
	private Date creationDate;
	private int quantity;
	private double price;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Collection<OrderdBook> getOrderdItem() {
		return orderdItem;
	}
	public void setOrderdItem(Collection<OrderdBook> orderdItem) {
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
	
	public void addCartItem(OrderdBook item) {
		orderdItem.add(item);
		updateGrandTotal();
	}
	public void removeCartItem(OrderdBook item) {
		orderdItem.remove(item);
		updateGrandTotal();
	}

	public void updateGrandTotal() {
		double totalPrice = 0D;
		Iterator<OrderdBook> it = orderdItem.iterator();
		while (it.hasNext()) {
			OrderdBook currentLineItem = it.next();
			totalPrice = totalPrice + currentLineItem.getPrice();
		}
		this.price = totalPrice;
	}

}
