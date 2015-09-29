<%@page import="com.lsk.entity.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Book Store</title>
</head>
<body>
	
			<% List<Book> list=(List<Book>)request.getAttribute("USERLIST");
			String msg=(String) request.getAttribute("MESSAGE");
			
			if(msg!=null)
			{
			%>
			<p><%= msg %>
			</p><%} %>
	
	
	 <p align="right">Welcome <%=session.getAttribute("USER_NAME")%>
	<a href="index.jsp">Home</a></p>
	
	<form action="BookServlet" method="post">
	
		 <input type="text" name=bookTitle>
	 	 <input type="submit" value="search">
	 	 <table border="1">
				
				<tr>
				<td>ISBN</td>
				<td>Title</td>
				<td>No_of_Books</td>
				<td>AuthorName</td>
				<td>Price</td>
				</tr>
				
				<%
				if(list!=null)
				{
				for(Book b:list) 
				{%>
				
				<tr>
				<td><%= b.getIsbn()%></td>
				<td><%= b.getTitle()%></td>
				<td><%= b.getNo_of_Books()%></td>
				<td><%= b.getAuthor().getName()%></td>
				<td><%= b.getPrice() %></td>

				
				<td><a href="http://localhost:8080/OnlineBookStore/CartServlet?ACTION=ADD&hdnbookIsbn=<%= b.getIsbn()%>&hdnbookTitle=<%= b.getTitle()%>&hdnbookprice=<%= b.getPrice() %>">Add to Cart</a></td>
				<input type="hidden"  name="hdnbookIsbn"/>
				<input type="hidden"  name="hdnbookTitle"/>
				<input type="hidden"  name="hdnbookprice"/>
				<input type="hidden"  name="item"/>
				 <input type="hidden" name="ACTION"  value="ADD"/> 
				<td>
				</tr>
				<%}} %>
				
	</form>
</body>
</html>