package com.lsk.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsk.entity.Book;
import com.lsk.entity.OrderCart;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
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
		String book_Isbn=request.getParameter("Isbn");  
		String book_Tite=request.getParameter("Title");
		float book_price=Float.parseFloat(request.getParameter("price")); 

		HttpSession session=request.getSession(true);
		Book book=new Book(book_Isbn, book_Tite, book_price);
	
		OrderCart cart = (OrderCart) session.getAttribute("OrderCart");

		if (cart == null)
		{
			cart = new OrderCart();

			session.setAttribute("OrderCart", cart);
		}

		cart.addItem(book);
		RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
		rd.forward(request, response);
	}

}
