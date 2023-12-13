<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styleMessageView.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
       
	<form action="pass" method="post">
		Enter Event Id here<br><br>
		<input type="text" name="eventid">
		<br><br>
		<input type="submit" name="submit" value="login">
		<br><br>
	</form>
	
	  
	<table>
    <c:forEach var="m" items="${mesDetails}">
	
    	<tr>
    		<td>MessageId</td>
    		<td>${m.messageid}</td>
    	</tr>
    	
    	<tr>
    		<td>Customer Name</td>
    		<td>${m.customername}</td>
    	</tr>
    	
    	<tr>
    		<td>Customer Email</td>
    		<td>${m.customeremail}</td>
    	</tr>
    	<tr>
    		<td>Message Description</td>
    		<td>${m.messagedescription}</td>
    	</tr>
    	<tr>
    		<td>Event ID</td>
    		<td>${m.eventid}</td>
    	</tr>
    	<tr>
    		<td><a href="DeleteMessageServlet?eventid=${m.eventid}">Delete</a></td>
    	</tr>
    	</c:forEach>
    	
    </table>
	
	<a href="updatePrint.jsp">
	<button type="submit" name="update" value="Update" > Update</button>
	</a>
	
	<button type="submit" name="delete" value="Delete" > Delete</button>
	
	

	
    
</body>
</html>