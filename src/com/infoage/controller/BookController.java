package com.infoage.controller;

import java.util.List;

import com.infoage.DAO.ItemDAO;
import com.infoage.domain.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class BookController {

    @Autowired
    private ItemDAO ItemDAO;

    @RequestMapping(value = {"/","/book_list"})
    public String listBooks(Model model) {
 
        List<Book> books = ItemDAO.listItemsByCategory();
        model.addAttribute("books", books);
        return "bookList";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String listBook(@ModelAttribute Book book) {
    	
        return "bookReg";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute Book book) {
    	ItemDAO.saveItem(book);
        return "redirect:/book_list";
    }

    @RequestMapping(value = "/book_edit/{id}")
    public String editBook(Model model, @PathVariable("id") String id) {
    	
        Book book = ItemDAO.updateItemByID(id);
        model.addAttribute(book);
     
        return "BookEditForm";
    }


  

}