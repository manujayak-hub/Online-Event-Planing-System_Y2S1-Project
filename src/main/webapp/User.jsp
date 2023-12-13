
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	document.addEventListener("DOMContentLoaded", function() {
		var wrapperDiv = document.querySelector('.wrapper');
		var updateButton = document.getElementById('updateButton');

		updateButton.addEventListener('click', function() {
			wrapperDiv.style.display = 'block';
		});
	});
</script>

<link rel="stylesheet" href="style_user.css" />
</head>
<body>

	<jsp:include page="Headerlogged.jsp" />

	<div class="userd">


		<c:forEach var="cus" items="${cusDetails}">

			<h2>Your Details</h2>
			<div class="card-list">
				<h3>Name :-${cus.name }</h3>
				<h3>Surname :-${cus.surName }</h3>
				<h3>Email :-${cus.email }</h3>

			</div>

			<c:set var="cusid" value="${cus.cusId}" />






			<form action="geteventDetailsServlet" method="post">
				<input type="hidden" name="customerid" id="customerid"
					value="${cus.cusId}"> <input type="submit"
					class="custom-button" value="Get your Event Details">
			</form>

		</c:forEach>

	</div>


	<div class="container">
		<table class="responsive-table">
			<caption>Your Details in Your Created Events</caption>
			<thead>
				<tr>
					<th scope="col">Event ID</th>
					<th scope="col">Customer ID</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Email</th>
					<th scope="col">Phone</th>
					<th scope="col">Address</th>



					<th scope="col">Click For Update</th>
					<th scope="col">Click For Delete</th>
				</tr>
				<c:forEach var="eve" items="${eventdetails}">
					<tbody>
						<tr>
							<td>${eve.idevent}</td>
							<td>${eve.cusid}</td>
							<td>${eve.firstName}</td>
							<td>${eve.lastName}</td>
							<td>${eve.email}</td>
							<td>${eve.phone}</td>
							<td>${eve.address}</td>

							<td><a href="UpdateEventServlet?idevent=${eve.idevent}">Update</a></td>
							<td><a href="DeleteEventServlet?idevent=${eve.idevent}">Delete</a></td>
						</tr>
					</tbody>
				</c:forEach>
		</table>
	</div>



	<div class="container">
		<table class="responsive-table">
			<caption>Event Details in Your Created Events</caption>
			<thead>
				<tr>


					<th scope="col">Event ID</th>
					<th scope="col">Event Type</th>
					<th scope="col">Event Date</th>
					<th scope="col">Venue</th>
					<th scope="col">Guests</th>
					<th scope="col">Theme</th>
					<th scope="col">Budget</th>
					<th scope="col">Services Required</th>
					<th scope="col">Special Requests</th>
					<th scope="col">Other Details</th>

					<th scope="col">Click For Update</th>
					<th scope="col">Click For Delete</th>
				</tr>
				<c:forEach var="eve" items="${eventdetails}">
					<tbody>
						<tr>

							<td>${eve.idevent}</td>
							<td>${eve.eventype}</td>
							<td>${eve.eventdate}</td>
							<td>${eve.venue}</td>
							<td>${eve.guests}</td>
							<td>${eve.theme}</td>
							<td>${eve.budget}</td>
							<td>${eve.servicesreuired}</td>
							<td>${eve.specialRequests}</td>
							<td>${eve.odetails}</td>

							<td><a href="UpdateEventServlet?idevent=${eve.idevent}">Update</a></td>
							<td><a href="DeleteEventServlet?idevent=${eve.idevent}">Delete</a></td>
						</tr>
					</tbody>
				</c:forEach>
		</table>
	</div>

	<div class="button-container">
		<button id="updateButton" class="ud">Update Details</button>


	</div>
	<br>






	<c:forEach var="eventToUpdate" items="${eventToUpdate}">

		<div class="wrapper" style="display: none;">
			<form action="UpdateEventServlet" method="post">
				+ <label for="Event Details Update Form">Event Details
					Update Form</label><br>

				<div class="input-box">
					<label for="eventid">Event ID:</label> <input type="text"
						id="idevent" name="idevent" value="${eventToUpdate.idevent}"
						readonly>
				</div>

				<div class="input-box">
					<label for="cusid">CusID:</label> <input type="text" id="cusid"
						name="cusid" value="${eventToUpdate.cusid}" readonly>
				</div>

				<div class="input-box">
					<label for="firstName">First Name:</label> <input type="text"
						id="firstName" name="firstName" value="${eventToUpdate.firstName}"
						required>
				</div>

				<div class="input-box">
					<label for="lastName">Last Name:</label> <input type="text"
						id="lastName" name="lastName" value="${eventToUpdate.lastName}"
						required>
				</div>

				<div class="input-box">
					<label for="email">Email Address:</label> <input type="email"
						id="email" name="email" value="${eventToUpdate.email}" required>
				</div>

				<div class="input-box">
					<label for="phone">Phone Number:</label> <input type="tel"
						id="phone" name="phone" value="${eventToUpdate.phone}" required>
				</div>

				<div class="input-box">
					<label for="address">Address:</label> <input type="text"
						id="address" name="address" value="${eventToUpdate.address}">
				</div>

				<label for="EventDetails">Event Details:</label><br>

				<div class="input-box">
					<label for="eventType">Event Type:</label> <input type="text"
						id="eventType" name="eventType" value="${eventToUpdate.eventype}"
						required>
				</div>

				<div class="input-box">
					<label for="eventDate">Event Date:</label> <input type="date"
						id="eventDate" name="eventDate" value="${eventToUpdate.eventdate}"
						required>
				</div>



				<div class="input-box">
					<label for="eventVenue">Event Venue:</label> <input type="text"
						id="eventVenue" name="eventVenue" value="${eventToUpdate.venue}"
						required>
				</div>

				<div class="input-box">
					<label for="guests">Number of Guests:</label> <input type="number"
						id="guests" name="guests" value="${eventToUpdate.guests}" required>
				</div>

				<div class="input-box">
					<label for="theme">Theme/Color Scheme:</label> <input type="text"
						id="theme" name="theme" value="${eventToUpdate.theme}">
				</div>

				<div class="input-box">
					<label for="budget">Budget:</label> <input type="text" id="budget"
						name="budget" value="${eventToUpdate.budget}" required>
				</div>





				<div class="input-box">
					<label for="serviseRequird">Services Required:</label> <input
						type="text" id="ServicesRequired" name="ServicesRequired"
						value="${eventToUpdate.servicesreuired}" required><br>
				</div>
				<div class="input-box">
					<label for="SpecialRequests">Special Requests:</label><br>
					<textarea id="SpecialRequests" name="SpecialRequests" rows="4"
						cols="50"> ${eventToUpdate.specialRequests}</textarea>
					<br>
				</div>
				<div class="input-box">
					<label for="otherdetails">other Details:</label><br>
					<textarea id="otherdetails" name="otherdetails" rows="6" cols="50">${eventToUpdate.odetails}</textarea>
					<br>
				</div>

				<div class="input-box button">
					<input type="Submit" value="Submit">
				</div>

			</form>
	</c:forEach>
	</div>





</body>
</html>