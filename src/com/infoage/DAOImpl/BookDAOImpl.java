package com.infoage.DAOImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infoage.DAO.BookDAO;
import com.infoage.domain.Book;
import com.infoage.domain.Customer;
@Repository
public class BookDAOImpl implements BookDAO{
	private static HashMap<String, Book> books = new HashMap<String, Book>();
	
	public BookDAOImpl(){
	Book book1=new Book();
	book1.setAuthor("Girma");
	book1.setCategory("Childrens");
	book1.setEdition(3);
	book1.setIsbn("233444444");
	book1.setItemId("c123");
	book1.setPublisher("pubfacts");
	book1.setTitle("Tom and Jerry");
	book1.setQuantity(100);
	book1.setUnitPrice(123);
	book1.setYearofPublication(new Date(12/2/2013));
	
	
	Book book2=new Book();
	book2.setAuthor("Temam");
	book2.setCategory("oldies");
	book2.setEdition(4);
	book2.setIsbn("233444444");
	book2.setItemId("c1234");
	book2.setPublisher("pubfacts");
	book2.setTitle("Fathers story");
	book2.setUnitPrice(123);
	book2.setYearofPublication(new Date(12/4/2010));
	book2.setQuantity(200);
	books.put(book1.getItemId(),book1);
	books.put(book2.getItemId(),book2);
	
	}
	
	
	@Override
	public List<Book> findByISBN(String isbn) {
		// TODO Auto-generated method stub
		List<Book> values = new ArrayList<Book>(books.values());
		return (List<Book>) values;
	}

	@Override
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Book findById(String id) {
		// TODO Auto-generated method stub
		
		
		return books.get(id);
	}

	@Override
	public List<Book> listAllItems() {
		// TODO Auto-generated method stub
		List<Book> values = new ArrayList<Book>(books.values());
		return values;
		
	}

	@Override
	public List<Book> listItemsByCategory() {
		// TODO Auto-generated method stub
		List<Book> values = new ArrayList<Book>(books.values());
		return values;
	}

	@Override
	public String saveItem(Book item) {
		// TODO Auto-generated method stub
		books.put(item.getItemId(),item);
		return "";
	}

	@Override
	public Book updateItemByID(Book item) {
		// TODO Auto-generated method stub
		books.put(item.getItemId(),item);
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
		books.remove(itemId);
		
	}



}
