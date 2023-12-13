<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="insertBudget.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class=header>
<jsp:include page="Headerlogged.jsp" />
</div>
<div class="head">
    
    <p>Stay in control <br/> of your  budget</p>


</div >

<form action="budgetInsertServlet" method="post">

        <label for="event-id">Event ID:</label>
        <input type="text" name="eventid" required><br>
        
        <label for="venue-cost">VenueCost:</label>
        <input type="number"  name="venuecost" required><br>

        <label for="guest-cost">Guest Cost:</label>
        <input type="number"  name="guestcost" required><br>

        <label for="entertainment-cost">Entertainment Cost:</label>
        <input type="number"  name="entertainmentcost" required><br>

        <label for="photography-cost">Photography Cost:</label>
        <input type="number"  name="photographycost" required><br>

        <label for="total-cost">Total Cost:</label>
        <input type="number"  name="totalcost" required><br>
        
       
        <button type="submit">Submit</button>



</form>

<div class="findbudget">
       
       <p>Check the details of an event</p>
       <a href="checkBudget.jsp">CLICK HERE</a>
</div>

</body>
</html>