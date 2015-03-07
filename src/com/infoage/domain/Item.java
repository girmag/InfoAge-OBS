package com.infoage.domain;
import java.util.Date;

public class Item {

	private String itemId;	
	private String title;
	private float unitPrice;
	private String publisher;
	private Date yearofPublication;
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String tittle) {
		this.title = tittle;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getYearofPublication() {
		return yearofPublication;
	}

	public void setYearofPublication(Date yearofPublication) {
		this.yearofPublication = yearofPublication;
	}





	

}
