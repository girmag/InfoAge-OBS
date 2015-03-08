package com.infoage.controller;

import java.util.List;









import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infoage.domain.Customer;
import com.infoage.domain.User;

@Controller
public class HomepageController {
	 @RequestMapping(value = {"/","/home"})
	    public String listBooks(Model model) {
	        
	        return "home";
	    }

	 
	 @RequestMapping(value = {"/addItem"})
	    public String addItems(Model model) {
	        
	        return "addItem";
	    }

	 @RequestMapping(value = {"/login"})
	    public String loginUser(Model model) {
	        User user= new User();
	        model.addAttribute("user", user);
	        return "login";
	    }

	 
	 @RequestMapping(value = {"/customers"})
	    public String logi(Model model, RedirectAttributes redirect) {
	        Customer customer= new Customer();
	        model.addAttribute("customer", customer);
	        
	        redirect.addFlashAttribute("customer", customer);
	        return "redirect:addCustomer";
	    }
	 @RequestMapping(value={"/addCustomer"}, method=RequestMethod.GET)
	 public String confirmUser(@Valid Customer customer,Model model,BindingResult result,HttpServletRequest request){
		 
		 if(result.hasErrors())
			 return "customerReg";
		 
		 return "confirmCustomer";
	 }
}
