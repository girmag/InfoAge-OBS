package com.infoage.DAOImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infoage.DAO.CustomerDAO;
import com.infoage.domain.Address;
import com.infoage.domain.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	//List<Customer> custList=new ArrayList();
	private static HashMap<String, Customer> custList = new HashMap<String, Customer>();
	public CustomerDAOImpl(){
		Customer cust1=new Customer();
		cust1.setCustomerId("E0002");
		cust1.setFirstName("Mona");
		cust1.setLastName("H/michael");
		cust1.setEmail("mona@yahoo.com");
		cust1.setPhone("206 333 4567");
		Address address=new Address();
		address.setCity("silcon vally");
		address.setCountry("USA");
		address.setZipCode(2222);
		address.setState("California");
		address.setStreet("N 3049");
		
		cust1.setAddress(address);
		custList.put(cust1.getEmail(),cust1);

		Customer cust2=new Customer();
		cust2.setCustomerId("E0001");
		cust2.setFirstName("Fifi");
		cust2.setLastName("W/hawriyat");
		cust2.setEmail("fit@yahoo.com");
		cust2.setPhone("206 444 4567");
		Address address2=new Address();
		address2.setCity("Fairfild");
		address2.setCountry("USA");
		address2.setZipCode(11111);
		address2.setState("Arizona");
		address2.setStreet("S 204");
		
		cust2.setAddress(address2);
		custList.put(cust2.getEmail(),cust2);

		
		
	}
	
	
	
	//private List<Customer> customers=new ArrayList<Customer>();;
	
	@Override
	public String saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		custList.put(customer.getEmail(),customer);
		return null;
	}


	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		List<Customer> values = new ArrayList<Customer>(custList.values());
		return values;
	}
	public String updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		custList.put(cust.getEmail(),cust);
		return null;
	}
	
	public Customer searchCustomer(String email) {
		// TODO Auto-generated method stub
		
		return custList.get(email);
	}
	public Customer deleteCustomer(String email) {
		// TODO Auto-generated method stub
		
		return custList.remove(email);
	} 

}
