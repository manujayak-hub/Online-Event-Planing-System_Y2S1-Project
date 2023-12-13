<!DOCTYPE html>
<html>
<head>
    
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
    <link rel="stylesheet" href="style_login.css">
         
    <title>Login</title> 
</head>
<body>

<jsp:include page="Header.jsp" />
    
    <div class="container">
        <div class="forms">
            <div class="form login">
                <span class="title">Login</span>

                <form action="log" method="post">
                    <div class="input-field">
                        <input type="text" name="uemail"  placeholder="Enter your email" required>
                        <i class="uil uil-envelope icon"></i>
                    </div>
                    <div class="input-field">
                        <input type="password" class="password" name="upw" placeholder="Enter your password" required>
                       
                        <i class="uil uil-eye-slash showHidePw"></i>
                    </div>

                    <div class="checkbox-text">
                        <div class="checkbox-content">
                            <input type="checkbox" id="logCheck">
                            <label for="logCheck" class="text">Remember me</label>
                        </div>
                        
                       
                    </div>

                    <div class="input-field button">
                        <input type="submit" value="Login" name ="submit">
                    </div>
                </form>

                <div class="login-signup">
                    <span class="text">Not a member?
                        <a href="Register.jsp" class="text signup-link">Signup Now</a>
                    </span>
                </div>
            </div>

          
        </div>
    </div>

   
</body>
</html>