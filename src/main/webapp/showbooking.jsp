<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Details</title>
<link rel="stylesheet" type="text/css" href="showbooking.css">
	
</head>
<body>
	<jsp:include page="Headerlogged.jsp" />
	<br>

	<div class="table-container">
		<h1 class="heading">Show Details</h1>

		<table class="table">
			<thead>
				<tr>

					<th>Event ID</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Location</th>
					<th>Band name</th>
					<th>Price range</th>
					<th>Ticket</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="i" items="${showdetails}">
					<tr>
						<td>${i.ideventcreate}</td>
						<td>${i.fullname}</td>
						<td>${i.email}</td>
						<td>${i.address}</td>
						<td>${i.location}</td>
						<td>${i.bandname}</td>
						<td>${i.pricerange}</td>
						<td>${i.ticket}</td>
						<td><a href="GetDetailsForUpdateServlet?idevent=${i.ideventcreate}">Update</a></td>
						<td><a href="deleteShowServlet?idevent=${i.ideventcreate}">Delete</a></td>

					</tr>

				</c:forEach>
			</tbody>
		</table>





		<div class="button-container">
			<button class="edit-button" id="edit-button">Edit</button>

			<a href="showServlet">
				<button class="show-button">Show Details</button>
			</a>
		</div>
	</div>

<form></form>
		
	
	


		<div class="form-container">
			<form  method="post" action="UpdateDataServlet">

	
	<c:forEach var="h" items="${getid}">
	
	

				<label for="fullName">Event ID:</label> 
				<input type="text"name="eventID" value="${h.ideventcreate}"> <br> 
				<label for="fullName">Full Name:</label> 
				<input type="text" name="fullName" value="${h.fullname}"> <br> 
				<label for="email">Email:</label> 
				<input type="email" name="email" value="${h.email}"> <br>
				<label for="address">Address:</label>
				<input type="text" name="address" value="${h.address}"> <br>
				<label for="location">Location:</label>
				<input type="text"	name="location" value="${h.location}"> <br>
				<label for="bandName">Band Name:</label>
				<input type="text" name="bandName" value="${h.bandname}"> <br>
				<label	for="priceRange">Price Range:</label>
				<input type="text" name="priceRange" value="${h.pricerange}"> <br> 
				<label	for="ticket">Ticket:</label>
				<input type="text" name="ticket" value="${h.ticket}"> <br> 
				<input type="submit" value="Update Event">
				
				</c:forEach>	
				
				

			</form>
		</div>
		
	
	<a href="eventcreate.jsp">
		<button id="view" class="ud">Click to create</button>
	</a>

	<script>
		// Get references to the button and form container
		const editButton = document.getElementById("edit-button");
		const formContainer = document.querySelector(".form-container");

		// Add a click event listener to the Edit button
		editButton.addEventListener("click", function() {
			// Toggle the visibility of the form container
			if (formContainer.style.display === "none") {
				formContainer.style.display = "block";
			} else {
				formContainer.style.display = "none";
			}
		});
	</script>




</body>
	
</html>
