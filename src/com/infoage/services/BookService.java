package com.infoage.services;

import java.util.List;



import com.infoage.domain.Book;

public interface BookService {
	public List<Book> findByISBN(final String isbn);
	public List<Book> findByTitle(final String isbn);
	public Book findById(final String isbn);
	public List<Book> listAllItems();
	public List<Book> listItemsByCategory();
	public String  saveItem(final Book item);
	public Book updateItemByID(final String itemID); // update item by Item 
	public Book updateItemByISBN(final String isbn); // update item by ISBN
	public void deleteByISBN(final String isbn);// to delete item by isbn
	public void deleteItemID(final String itemId); // to delete item by its copy id or original id

}
