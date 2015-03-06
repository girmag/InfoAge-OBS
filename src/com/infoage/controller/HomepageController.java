package com.infoage.controller;

import java.util.List;





import org.apache.tomcat.jni.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infoage.domain.Customer;

@Controller
public class HomepageController {
	 @RequestMapping(value = {"/", "/addCustomer"})
	    public String listBooks(Model model) {
		 Customer newCustomer=new Customer();
		 model.addAttribute("customer",newCustomer);
		 
		 
		  return "customerReg";
	    }

}
