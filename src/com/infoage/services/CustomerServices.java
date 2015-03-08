package com.infoage.services;

import java.util.List;


import com.infoage.domain.Customer;

public interface CustomerServices {
	public String  saveCustomer(final Customer customer);
	public List<Customer> listCustomers();

}
