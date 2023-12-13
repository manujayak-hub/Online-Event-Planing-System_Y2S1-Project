	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<!DOCTYPE html>
<html>
<head>
<title>Event Planning Form</title>
<link rel="stylesheet" href="style_CEForm.css">
<!-- Link to your CSS file -->
</head>
<body>
	<jsp:include page="Headerlogged.jsp" />

	<div class="wrapper">
		<form action="chooseEventServlet" method="post">


			<label for="ContactInformation">Contact Information:</label><br>

			<div class="input-box">
				<label for="cusid">CusID:</label> <input type="text"
					id="cusid" name="cusid" required>
			</div>
			
			<div class="input-box">
				<label for="firstName">First Name:</label> <input type="text"
					id="firstName" name="firstName" required>
			</div>

			<div class="input-box">
				<label for="lastName">Last Name:</label> <input type="text"
					id="lastName" name="lastName" required>
			</div>

			<div class="input-box">
				<label for="email">Email Address:</label> <input type="email"
					id="email" name="email" required>
			</div>

			<div class="input-box">
				<label for="phone">Phone Number:</label> <input type="tel"
					id="phone" name="phone" required>
			</div>

			<div class="input-box">
				<label for="address">Address:</label> <input type="text"
					id="address" name="address">
			</div>

			<label for="EventDetails">Event Details:</label><br>

			<div class="input-box">
				<label for="eventType">Event Type:</label> <input type="text"
					id="eventType" name="eventType" required>
			</div>

			<div class="input-box">
				<label for="eventDate">Event Date:</label> <input type="date"
					id="eventDate" name="eventDate" required>
			</div>



			<div class="input-box">
				<label for="eventVenue">Event Venue:</label> <input type="text"
					id="eventVenue" name="eventVenue" required>
			</div>

			<div class="input-box">
				<label for="guests">Number of Guests:</label> <input type="number"
					id="guests" name="guests" required>
			</div>

			<div class="input-box">
				<label for="theme">Theme/Color Scheme:</label> <input type="text"
					id="theme" name="theme">
			</div>

			<div class="input-box">
				<label for="budget">Budget:</label> <input type="text" id="budget"
					name="budget" required>
			</div>





			<div class="input-box">
				<label for="serviseRequird">Services Required:</label> <input
					type="text" id="ServicesRequired" name="ServicesRequired" required><br>
			</div>
			<div class="input-box">
				<label for="SpecialRequests">Special Requests:</label><br>
				<textarea id="SpecialRequests" name="SpecialRequests" rows="4"
					cols="50"></textarea>
				<br>
			</div>
			<div class="input-box">
				<label for="otherdetails">other Details:</label><br>
				<textarea id="otherdetails" name="otherdetails" rows="6" cols="50"></textarea>
				<br>
			</div>

			<div class="input-box button">
				<input type="Submit" value="Submit">
			</div>

		</form>
	</div>

</body>
</html>
