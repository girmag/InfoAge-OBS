package com.infoage.domain;
public class OrderdBook {

	private int id;
	private Book book;
	private int quantity;
//	private double price;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
	public int getNumber() {
		return id;
	}
	public void setNumber(int number) {
		this.id = number;
	}
	

	

}
