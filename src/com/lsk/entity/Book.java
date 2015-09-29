package com.lsk.entity;

public class Book {
	
	private String isbn;
	private String title;
	private float price;
	private String category;
	private int no_of_Books;
	private Author author;
	public int orderQuantity;
	public Book(String isbn, String title, float price, String category,
			int no_of_Books, Author author, int orderQuantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.category = category;
		this.no_of_Books = no_of_Books;
		this.author = author;
		this.orderQuantity = orderQuantity;
	}
	
	
	public Book(String isbn, String title, float price, String category,
			int no_of_Books, Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.category = category;
		this.no_of_Books = no_of_Books;
		this.author = author;
	}
	


	public Book(String isbn, String title, float price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}


	public Book(String isbn, String title, float price, Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getNo_of_Books() {
		return no_of_Books;
	}
	public void setNo_of_Books(int no_of_Books) {
		this.no_of_Books = no_of_Books;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	

}
