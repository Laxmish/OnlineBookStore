<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="post">	
	<% String msg=(String)request.getAttribute("MESSAGE"); 

		if(msg!=null)
		{%>
		 
		<%= msg %>
		
		<% }%>	
	<table align="center">
	
	
		<tr> <th>Username:</th><td><input type="text" name="username"></td></tr>
		<tr> <th>Password:</th><td><input type="password" name="password"></td></tr>
		<tr> <th><input type="Submit" value="Submit"></th></tr>
		
	</table>
	</form>

</body>
</html>