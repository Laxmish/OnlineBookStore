package com.lsk.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConManager {
	private static Context initcontext;
	private static Context envContext;
	private static  DataSource ds;
	static
	{
		try 
		{
			initcontext = new InitialContext();
			envContext  = (Context)initcontext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/trng");
		} 
		catch (NamingException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{	Connection conn=null;
		try {
			conn=ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
