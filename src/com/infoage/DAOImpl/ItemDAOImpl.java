package com.infoage.DAOImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.infoage.DAO.ItemDAO;
import com.infoage.domain.Book;
import com.infoage.domain.Customer;

public class ItemDAOImpl implements ItemDAO{
	private static HashMap<String, Book> books = new HashMap<String, Book>();
		
	
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
		
		return null;
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
