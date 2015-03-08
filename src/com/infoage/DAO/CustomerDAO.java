package com.infoage.DAO;


import java.util.ArrayList;
import java.util.List;

import com.infoage.domain.Customer;

public interface CustomerDAO {
	public String  saveCustomer(final Customer item);
	public List<Customer> listCustomers();
}
