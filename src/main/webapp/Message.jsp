<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WebPage</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
	<form action="insert" method="post">
		 <h2>We Create You !</h2>

		<label for="customername">Enter your Name</label>
		<input type="text" name="customername"><br>
		
		<label for="customeremail">Enter your Email</label>
		<input type="text" name="customeremail"><br>
		
		<label for="messagedescription">Enter your Message</label>
		<input type="text" name="messagedescription"><br>
		
		<label for="eventid">Enter your EventId</label>
		<input type="text" name="eventid"><br>
		
		<input type="submit" name="submit" value="Send">
		
	</form>
		
		
		
		
		
	
</body>
</html>