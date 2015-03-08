package com.infoage.domain;
import java.util.Collection;

public class BookStore {

	private String name;
	private Collection<Book> books;
	private Collection<Employees> employees;
	private Collection<Customer> customers;
	private Collection<OrderLine> orders;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Book> getBooks() {
		return books;
	}
	public void setItems(Collection<Book> books) {
		this.books = books;
	}
	public Collection<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(Collection<Employees> employees) {
		this.employees = employees;
	}
	public Collection<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Collection<Customer> customers) {
		this.customers = customers;
	}
	public Collection<OrderLine> getOrderline() {
		return orders;
	}
	public void setOrderline(Collection<OrderLine> orders) {
		this.orders = orders;
	}
	
	

}
