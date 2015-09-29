package com.lsk.services;

import java.util.List;

import com.lsk.db.BookDAO;
import com.lsk.entity.Book;

public class BookService {
	
	
	public static List<Book> getBook(String searchTitle)
	{
		BookDAO dao = new BookDAO();
		return dao.getBook(searchTitle);
	}

}
