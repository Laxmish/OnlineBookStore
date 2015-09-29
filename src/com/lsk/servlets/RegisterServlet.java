package com.lsk.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsk.entity.User;
import com.lsk.services.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String username= request.getParameter("username");
		String firstrname= request.getParameter("firstname");
		String lastname= request.getParameter("lastname");
		String password=request.getParameter("password");
		String email= request.getParameter("email");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String phno= request.getParameter("phNo");
		
		User user=new User(username, firstrname, lastname, password, email, city, state, phno);
		String msg=null;
		 RequestDispatcher rd;
		if(UserService.create(user))
		{
			msg="Sucessfully created";
			HttpSession session = request.getSession(true);
			session.setAttribute("USER_NAME", username);
			rd=getServletContext().getRequestDispatcher("/home.jsp");
		}
		else
		{
			msg="Failed!.Please contact admin";
			rd=getServletContext().getRequestDispatcher("/register.jsp");
		}
		
		request.setAttribute("MESSAGE", msg);
		rd.forward(request, response);
	}

}
