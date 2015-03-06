package com.infoage.scontrollers;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Item {
	 @RequestMapping(value = "vendor/Item/save", method = RequestMethod.POST)
	    public String saveItem(Item Item, BindingResult result) {
	        if (result.hasErrors()) {
	            return "Itemform";
	        } 
	        return "redirect:/vendor/Itemlist";
	    }	   
	    @RequestMapping("/vendor/Itemform")
	    public String vendorItemForm(Item Item) {
	        return "/vendor/Itemform";
	    }

	    


	    
	  
	    

}
