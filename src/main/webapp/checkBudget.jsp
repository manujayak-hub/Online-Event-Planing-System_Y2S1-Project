<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="checkBudget.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Headerlogged.jsp" />
	<form action="pass" method="post">

		<label for="eventid"> Type Your Event id here</label> <input
			type="text" name="eventid" required><br>
		<button type="submit" name="submit">Submit</button>


	</form>
  
   <table>
    <tr>
        <th>Budget ID</th>
        <th>Event ID</th>
        <th>Venue Cost</th>
        <th>Guest Cost</th>
        <th>Entertainment Cost</th>
        <th>Photography Cost</th>
        <th>Total Cost</th>
    </tr>
    
    <c:forEach var="bud" items="${budgetInfo}">

			
			<tr>
            <td>${bud.budgetid}</td>
            <td>${bud.eventid}</td>
            <td>${bud.venuecost}</td>
            <td>${bud.guestcost}</td>
            <td>${bud.entertainmentcost}</td>
            <td>${bud.photographycost}</td>
            <td>${bud.totalcost}</td>
        </tr>
   
   </c:forEach>
	

   </table>
   
 
   
   
   <a href="updateBudget.jsp">
   <button type="submit" name="update" value="Update"> Update</button>
   </a>
    <a href="deleteBudget.jsp">
  <button type="submit" name="delete" value="Delete"> Delete</button>
   </a>
   






</body>
</html>