package com.infoage.domain;
import java.util.Collection;

public class OrderLine {

	private float subTotoal;

	private float tax;

	private float shipmentfee;

	private float total;

	private Customer places;

	private Collection<OrderdBook> orderdItem;
	

	public float getSubTotoal() {
		return subTotoal;
	}

	public void setSubTotoal(float subTotoal) {
		this.subTotoal = subTotoal;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getShipmentfee() {
		return shipmentfee;
	}

	public void setShipmentfee(float shipmentfee) {
		this.shipmentfee = shipmentfee;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Customer getPlaces() {
		return places;
	}

	public void setPlaces(Customer places) {
		this.places = places;
	}

	public Collection<OrderdBook> getOrderdItem() {
		return orderdItem;
	}

	public void setOrderdItem(Collection<OrderdBook> orderdItem) {
		this.orderdItem = orderdItem;
	}

}
