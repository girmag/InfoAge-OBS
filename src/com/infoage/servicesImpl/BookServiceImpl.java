package com.infoage.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infoage.domain.Book;
import com.infoage.services.BookService;
@Service
public class BookServiceImpl  implements BookService{

	@Override
	public String saveItem(Book book) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Book> findByISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByTitle(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findById(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> listAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> listItemsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}


	

	@Override
	public Book updateItemByISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByISBN(String isbn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItemID(String itemId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Book updateItemByID(String itemID) {
		// TODO Auto-generated method stub
		return null;
	}

}