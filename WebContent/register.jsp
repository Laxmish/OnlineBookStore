<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="RegisterServlet" method="post">
			<% String msg=(String)request.getAttribute("MESSAGE"); 
	
			if(msg!=null)
			{%>
			 
			<%= msg %>
			
			<% }%>	
		<table align="center">
		
			<tr> <th>Username:</th><td><input type="text" name="username"></td></tr>
			<tr> <th>Firstname:</th><td><input type="text" name="firstname"></td></tr>
			<tr> <th>Lastname:</th><td><input type="text" name="lasttname"></td></tr>
			<tr> <th>Password:</th><td><input type="password" name="password" ></td></tr>
			<tr> <th>Email:</th><td><input type="text" name="email"></td></tr>
			<tr> <th>City:</th><td><input type="text" name="city"></td></tr>
			<tr> <th>State:</th><td><input type="text" name="state"></td></tr>
						
			<tr> <th>PhNo:</th><td><input type="text" name="phNo"></td></tr>
			<tr> <th><input type="Submit" value="Submit"></th></tr>
			
		</table>
		</form>

</body>
</html>