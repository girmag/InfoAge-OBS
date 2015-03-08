package com.infoage.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoage.DAOImpl.BookDAOImpl;
import com.infoage.domain.Book;
import com.infoage.services.BookService;
@Service
public class BookServiceImpl  implements BookService{
@Autowired
BookDAOImpl bookdaoimpl;
	@Override
	public String saveItem(Book book) {
		// TODO Auto-generated method stub
		return bookdaoimpl.saveItem(book);
	}



	@Override
	public List<Book> findByISBN(String isbn) {
		// TODO Auto-generated method stub
		return bookdaoimpl.findByISBN(isbn);
	}

	@Override
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		return bookdaoimpl.findByTitle(title);
	}

	@Override
	public Book findById(String id) {
		// TODO Auto-generated method stub
		return bookdaoimpl.findById(id);
	}

	@Override
	public List<Book> listAllItems() {
		// TODO Auto-generated method stub
		return bookdaoimpl.listAllItems();
	}

	@Override
	public List<Book> listItemsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}


	

	@Override
	public Book updateItemByISBN(String isbn) {
		// TODO Auto-generated method stub
		return bookdaoimpl.updateItemByISBN(isbn);
	}

	@Override
	public void deleteByISBN(String isbn) {
		// TODO Auto-generated method stub
		bookdaoimpl.deleteByISBN(isbn);
	}

	@Override
	public void deleteItemID(String itemId) {
		// TODO Auto-generated method stub
		bookdaoimpl.deleteItemID(itemId);
	}



	@Override
	public Book updateItemByID(String itemID) {
		// TODO Auto-generated method stub
		return null;
	}

}
