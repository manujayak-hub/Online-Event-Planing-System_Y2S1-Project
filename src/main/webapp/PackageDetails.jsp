<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style_register.css">
</head>
<body>

<jsp:include page="Header.jsp" />


<c:forEach var="cus" items="${cusDetails}">
    	
    	${cus.cusId }
    	${cus.name }
    	${cus.surName }
    	${cus.email }
    	${cus.passWord }
    	</c:forEach>
    	 

    	<h1>adooo</h1>
	  
 <div class="wrapper">
    <form action="#">
    
    
   		<label for="eventType">Event Type:</label><br>
        <input type="radio" id="wedding" name="eventType" value="wedding" required>
        <label for="wedding">Wedding</label>
        
        <input type="radio" id="birthday" name="eventType" value="birthday">
        <label for="birthday">Birthday</label>
        
        <input type="radio" id="other" name="eventType" value="other">
        <label for="other">Other</label><br>
      <div class="input-box">
        <label for="packageTitle">Package Title:</label>
        <input type="text" id="packageTitle" name="packageTitle" required><br>
      </div>
      <div class="input-box">
         <label for="packageDescription">Package Description:</label><br>
        <textarea id="packageDescription" name="packageDescription" rows="4" cols="50" required></textarea><br>
      </div>
      <div class="input-box">
       <label for="packageIncludes">Package Includes (one item per line):</label><br>
        <textarea id="packageIncludes" name="packageIncludes" rows="6" cols="50" required></textarea><br>
      </div>
      
      <div class="input-box button">
        <input type="Submit" value="Add Package">
      </div>
      
    </form>
  </div>
  

</body>
</html>