<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <link rel="stylesheet" href="style_eventcreate.css">

</head>
<body>
<jsp:include page="Headerlogged.jsp" />
<br>
<div class="container">

    <form action="insert" method="post">

        <div class="row">

            <div class="col">

                <h3 class="title">Creating a Musical Concert</h3>

                <div class="inputBox">
                    <span>full name :</span>
                    <input type="text" name="fullname" placeholder="Enter Your Name">
                </div>
                <div class="inputBox">
                    <span>email :</span>
                    <input type="email" name="email" placeholder="Enter Your Email">
                </div>
                <div class="inputBox">
                    <span>address :</span>
                    <input type="text" name="address" placeholder="Enter Your Address">
                </div>
                
               
                <div class="inputBox">
                    <span>Location :</span>
                    <input type="text" name="location" placeholder="Location for the event">
                </div>

                <div class="flex">
                    <div class="inputBox">
                        <span>Band Name:</span>
                        <input type="text" name="bandname" placeholder="Band Name">
                    </div>
                    <div class="inputBox">
                        <span>Price Range:</span>
                        <input type="text" name="pricerange" placeholder="Price Range">
                    </div>
                    <div class="inputBox">
                        <span>Ticket :</span>
                        <input type="text" name="ticket" placeholder="Ticket range">
                    </div>
                </div>

            </div>

           
    
        </div>

        <input type="submit" value="proceed to Create Event" class="submit-btn">

    </form>
    
    <a href="showbooking.jsp">
    <button id="view" class="ud">Click to View</button>
    </a>

</div>    
    
</body>
</html>