package com.lsk.services;

import com.lsk.db.UserDAO;
import com.lsk.entity.User;

public class UserService {
	

	public static boolean authonticate(String uname, String password) {
		UserDAO dao = new UserDAO();
		return  dao.getUser(uname, password);
	}

	public static boolean create(User user) 
	{
		UserDAO dao = new UserDAO();
		return dao.create(user);
	}

}