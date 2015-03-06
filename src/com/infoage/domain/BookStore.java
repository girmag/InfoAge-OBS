package com.infoage.domain;
import java.util.Collection;

public class BookStore {

	private String name;
	private Collection<Item> items;
	private Collection<Employees> employees;
	private Collection<Customer> customers;
	private Collection<Order> orders;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(Collection<Item> items) {
		this.items = items;
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
	public Collection<Order> getOrderline() {
		return orders;
	}
	public void setOrderline(Collection<Order> orders) {
		this.orders = orders;
	}
	
	

}
