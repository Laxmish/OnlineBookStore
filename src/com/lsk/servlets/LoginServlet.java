package com.lsk.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsk.services.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		String msg=null;
		RequestDispatcher rd;
		
		if(UserService.authonticate(uname,password))
		{	
			HttpSession session = request.getSession(true);
			session.setAttribute("USER_NAME", uname);
			msg="Login sucessfull";
			rd=getServletContext().getRequestDispatcher("/home.jsp");
			
		}
		else
		{	msg="Username or Password is Wrong";
			rd=getServletContext().getRequestDispatcher("/Login.jsp");
		}
	
		request.setAttribute("MESSAGE", msg);
		rd.forward(request, response);
	}

}
