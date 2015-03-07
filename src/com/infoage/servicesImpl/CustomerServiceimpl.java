package com.infoage.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoage.DAOImpl.CustomerDAOImpl;
import com.infoage.domain.Customer;
import com.infoage.services.CustomerServices;
@Service
public class CustomerServiceimpl implements CustomerServices{
@Autowired 
CustomerDAOImpl cust;
	@Override
	public String saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cust.saveCustomer(customer);
		return null;
	}

	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		cust.listCustomers();
		return cust.listCustomers();
	}

}
