<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>EventWise-Header</title>
  <link rel="stylesheet" href="style_header.css" />
</head>
<body>
  <header class="header">
    <nav class="navbar">
      <h2 class="logo"><a href="index.jsp">EventWise</a></h2>
      <ul class="links">
        <li><a href="indexlogged.jsp">Home</a></li>
        <li><a href="#">About Us</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Events</a></li>
        <li><a href="#">Contact Us</a></li>
      </ul>
      <div class="buttons">
        <c:choose>
          <c:when test="${not empty cusDetails}">
            <c:forEach var="cus" items="${cusDetails}">
              <a href="User.jsp"><span>${cus.name}</span></a>
              <span>${cus.cusId}</span>

            </c:forEach>
            <form action="logoutServlet" method="post">
              <button type="submit" class="logout">Logout</button>
            </form>
          </c:when>
          <c:otherwise>
            <a href="login.jsp" class="signin">Sign In</a>
            <a href="Register.jsp" class="signup">Sign Up</a>
          </c:otherwise>
        </c:choose>
      </div>
    </nav>
  </header>
</body>
</html>
