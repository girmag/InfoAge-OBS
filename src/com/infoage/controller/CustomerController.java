package com.infoage.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infoage.DAOImpl.CustomerDAOImpl;
import com.infoage.DAOImpl.BookDAOImpl;
import com.infoage.domain.Customer;

@Controller
public class CustomerController {
	@Autowired
    private CustomerDAOImpl custdao;
		
	 @RequestMapping(value = {"/customer_list"})
	    public String listBooks(Model model) {
	 
	        List<Customer> books = custdao.listCustomers();
	        model.addAttribute("books", books);
	        return "addItem";
	    }

	    @RequestMapping(value = "/addcustomer", method = RequestMethod.GET)
	    public String inputBook(@ModelAttribute("newcustoemr") Customer custoemr, Model model) {
	        List<Customer> customers = custdao.listCustomers();
	        model.addAttribute("customers", customers);
	         return "home";
	    }

	

}
