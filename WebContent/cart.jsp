<%@page import="com.lsk.entity.Book"%>
<%@page import="com.lsk.entity.OrderCart"%>
<%@page import="java.util.Vector"%>
<%@page import="java.text.NumberFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <p align="right">Welcome : <%=session.getAttribute("USER_NAME")%>
	<a href="index.jsp"><input type="button" value="Home" ></a></p>


	
<%

	OrderCart cart = (OrderCart) session.getAttribute("OrderCart");

    Vector<Book> items =(Vector<Book>) cart.getItems();

    if (items.size() == 0)
    {
        out.println("<h3>Your cart is empty.</h3>");
    }
    else
    {
%>

<br>
<table border=4>
<tr><th>BookIsbn</th><th>BookTitle</th><th>Price</th></tr>
<%

        int numItems = items.size();

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        for (int i=0; i < numItems; i++)
        {
            Book item = (Book) items.elementAt(i);
			
            %>
           
            <td><%=item.getIsbn()%></td>
        
           <td><%=item.getTitle() %> </td>
            
            <td><%=currency.format(item.getPrice()) %></td>

        
            <td> <a href="http://localhost:8080/OnlineBookStore/RemoveServlet?item=<%=i%>">Remove</a></td></tr> 
            
                
            
     <%  }
    }
%>
<input type="hidden"  name="item"/>
    <a href="checkout.jsp">Checkout</a>
</body>
</html>