<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h2> Success Page</h2>
<h4>Successfully created student</h4>
 <% String name = request.getParameter("name");%> 
 <% String age = request.getParameter("age");%> 
 <% String mobileno = request.getParameter("mobileno");%> 
 <% String address = request.getParameter("address");%> 
 Name = <%=name %><br>
 Age = <%=age %><br>
 Mobileno = <%=mobileno %><br>
 Address = <%=address %><br>

</body>
</html>