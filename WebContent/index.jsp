<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
		<p align="right"><a href="Login.jsp">Login</a>
		<a href="register.jsp">Register</a></p>
		
		<form action="BookServlet" method="post">
		<input type="text" name="bookTitle"  placeholder="Enter The BookName">
		<input type="submit" value="Booksearch" >
		</form>


</body>
</html>