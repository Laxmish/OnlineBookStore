package com.lsk.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lsk.entity.Author;
import com.lsk.entity.Book;

public class BookDAO {
	
	
	private static final String SEARCH_SQL="select b.Book_ISBN,b.Book_Title,b.price,a.Author_Name,a.Author_Mail_id from book b,author a where b.Book_ISBN=a.Book_ISBN and b.Book_Title=?";
	
	
		public  List<Book> getBook(String searchTitle)
		{
			Connection conn =DBConManager.getConnection();
			List<Book> list=new ArrayList<Book>();
			
			  try 
			  {
				PreparedStatement ps=conn.prepareStatement(SEARCH_SQL);
				ps.setString(1, searchTitle);
				ResultSet rs= ps.executeQuery();
		
					/*while(rs!=null && rs.next())
					{
						
						Author a=new Author(rs.getString(4), rs.getString(5));
						Book b=new Book(rs.getString(1), rs.getString(2), rs.getFloat(3), a);
						list.add(b);
					}*/
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
			    }
			return list;
}}
