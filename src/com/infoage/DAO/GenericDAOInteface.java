/**
 * 
 */
package com.infoage.DAO;

import java.util.List;

/**
 * @author GirmaGuta
 *
 */
public interface GenericDAOInteface<D> {
		
		public List<D> findByISBN(final String isbn);
		public List<D> findByTitle(final String isbn);
		public D findById(final String isbn);
		public List<D> listAllItems();
		public List<D> listItemsByCategory();
		public D saveItem(final D item);
		public D updateItemByID(final D itemID); // update item by Item 
		public D updateItemByISBN(final D isbn); // update item by ISBN
		public void deleteByISBN(final D isbn);// to delete item by isbn
		public void deleteItemID(final D itemId); // to delete item by its copy id or original id
		public void deleteByISBN(final long isbn);// to delete item by isbn
		
}
