<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<style>
table#nat{
	width: 50%;
	background-color: #c48ec5;
}
</style>
</head>
<body>  
<% 
    //String UserID =  request.getParameter("UserID");
    String Level = request.getParameter("Level");
    String Points=request.getParameter("KindlePoints");
 %>
<table id ="nat">
    
<tr>
	<td>Level</td>
	<td><%= Level %></td>
</tr>
<tr>
	<td>KindlePoints</td>
	<td><%= Points %></td>
</tr>
</table>
</body>
</html>