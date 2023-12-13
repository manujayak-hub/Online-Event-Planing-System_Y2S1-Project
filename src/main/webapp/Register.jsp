<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="style_register.css">
<script>
function validateForm() {
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    
    if (password !== confirmPassword) {
        alert("Passwords do not match.");
        return false;
    }
    return true;
}
</script>
</head>
<body>

<jsp:include page="Header.jsp" />

<div class="wrapper">
    <h2>Registration</h2>
    <form action="registerServlet" method="post" onsubmit="return validateForm()">
        <div class="input-box">
            <input type="text" placeholder="Enter your FirstName" name="firstname" required>
        </div>
        <div class="input-box">
            <input type="text" placeholder="Enter your SurName" name="lastname" required>
        </div>
        <div class="input-box">
            <input type="email" placeholder="Enter your email" name="email" required>
        </div>
        <div class="input-box">
            <input type="password" placeholder="Create password" id="password" name="password" required>
        </div>
        <div class="input-box">
            <input type="password" placeholder="Confirm password" id="confirmPassword" name="confirmPassword" required>
        </div>
        <div class="input-box button">
            <input type="Submit" value="Register Now">
        </div>
        <div class="text">
            <h3>Already have an account? <a href="login.jsp">Login now</a></h3>
        </div>
    </form>
</div>

</body>
</html>
