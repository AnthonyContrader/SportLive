<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
<body>

<body style="background-color: #262626;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
			  
				<form class="login100-form validate-form" action="/User/login" method="post">
				     
					<span class="login100-form-title p-b-43">
						Please insert your data 
					</span>
					
					
					<div class="wrap-input100 validate-input" data-validate = "Valid password is required">
						<input class="input100" type="text" name="username">
						<span class="focus-input100"></span>
						<span class="label-input100">Name</span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "Valid password is required">
						<input class="input100" type="text" name="username">
						<span class="focus-input100"></span>
						<span class="label-input100">Surname</span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "Valid password is required">
						<input class="input100" type="text" name="username">
						<span class="focus-input100"></span>
						<span class="label-input100">Username</span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="password">
						<span class="focus-input100"></span>
						<span class="label-input100">Password</span>
					</div>

					
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Sign In
						</button>
					</div>
					
							
										
				</form>
				<img alt="" src="login/img/logologo.png" width="350px" height="350px" align="middle" class= "center" style="margin-top: 200px">
				</div>
				
		</div>
	</div>

</body>
</html>