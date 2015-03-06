package com.infoage.controller;

import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	 @RequestMapping(value = {"/"})
	    public String listBooks(Model model) {
	 
	       
	        return "home";
	    }

}
