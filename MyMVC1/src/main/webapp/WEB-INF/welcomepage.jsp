<%@page import="model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Customer customer = (Customer)request.getAttribute("customer"); %>
 <h2>Welcome  <%=customer.getCustName() %></h2> 
 <h2>  <%=customer.getAddress().getCity() %></h2>
</body>
</html>