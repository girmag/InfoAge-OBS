package com.infoage.DAOImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infoage.DAO.CustomerInterfae;
import com.infoage.domain.Customer;
@Repository
public class CustomerDAOImpl implements CustomerInterfae {
	//private List<Customer> customers=new ArrayList<Customer>();;
	private static HashMap<String, Customer> customers = new HashMap<String, Customer>();
	@Override
	public String saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(customer.getEmail(),customer);
		return null;
	}


	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		List<Customer> values = new ArrayList<Customer>(customers.values());
		return values;
	}
	public String updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		customers.put(cust.getEmail(),cust);
		return null;
	}
	
	public Customer searchCustomer(String email) {
		// TODO Auto-generated method stub
		
		return customers.get(email);
	}
	public Customer deleteCustomer(String email) {
		// TODO Auto-generated method stub
		
		return customers.remove(email);
	} 

}
