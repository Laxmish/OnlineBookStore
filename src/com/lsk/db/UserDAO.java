package com.lsk.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lsk.entity.User;

public class UserDAO {

	public boolean getUser(String uname, String password) {
		String sql="select username ,password from user where username=? and password=?";
		Connection conn=DBConManager.getConnection();
		ResultSet rs=null;
		boolean flag=false;
		try {
			PreparedStatement ps =conn.prepareStatement(sql);
			
			ps.setString(1, uname);
			ps.setString(2, password);
			 rs= ps.executeQuery();
			 while(rs!=null&&rs.next())
				{
				 flag=true;
				}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	private int row=0;
	private final static String sql="insert into user(username,firstname,lastname,password,email,city,state,phNo)" +
            " values(?,?,?,?,?,?,?,?)";
	public boolean create(User user) 
	{
		Connection conn=DBConManager.getConnection();
		try 
		{
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getFirstName());
		ps.setString(3, user.getLastName());
		ps.setString(4, user.getPassword());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getCity());
		ps.setString(7, user.getState());
		ps.setString(8, user.getPhno());
		
		row=ps.executeUpdate();
			
		conn.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row>0;
		
	}
	

}

