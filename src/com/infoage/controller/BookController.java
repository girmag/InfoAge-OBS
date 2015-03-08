package com.infoage.controller;

import java.util.List;



import com.infoage.domain.Book;
import com.infoage.service.BookService;

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
    private BookService bookservice;

    @RequestMapping(value = {"/","/book_list"})
    public String listBooks(Model model) {
 
        List<Book> books = bookservice.listItemsByCategory();
        model.addAttribute("books", books);
        return "bookList";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String listBook(@ModelAttribute Book book) {
    	
        return "bookReg";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute Book book) {
    	bookservice.saveItem(book);
        return "redirect:/book_list";
    }

    @RequestMapping(value = "/book_edit/{id}")
    public String editBook(Model model, @PathVariable("id") String id) {
    	
        Book book = bookservice.updateItemByID(id);
        model.addAttribute(book);
     
        return "BookEditForm";
    }


  

}