<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/MyMVC1/Welcomepage" method = "post">
 <B>Enter Customer Name </B><input type = "text" name = "custName" /><br>
<B>Enter Customer Gender  </B><input type = "text" name = "gender" /><br> 
<B>Enter Customer DoorNo </B><input type = "text" name = "doorNumber" /><br>
<B>Enter Customer Street  </B><input type = "text" name = "street" /><br>
<B>Enter Customer City </B><input type = "text" name = "city" /><br>
<B>Enter Customer State  </B><input type = "text" name = "state" /><br>
<B>Enter Customer Zip code  </B><input type = "text" name = "zipCode" /><br>
<input type = "submit" value = "submit"/>
</form>
</body>
</html>