package com.infoage.controller;

import java.util.List;






import org.apache.tomcat.jni.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infoage.domain.Customer;
import com.infoage.domain.User;

@Controller
public class HomepageController {
	@RequestMapping(value = {"/", "/login"})
    public String inputUser(Model model) {
	 User user=new User();
	 model.addAttribute("user",user);
	 
	 
	  return "login";
    }
	
	
	
	 @RequestMapping(value = {"/addCustomer"})
	    public String listBooks(Model model) {
		 Customer newCustomer=new Customer();
		 model.addAttribute("customer",newCustomer);
		 
		 
		  return "customer";
	    }

}
