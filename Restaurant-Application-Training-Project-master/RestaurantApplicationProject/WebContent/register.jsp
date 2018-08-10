<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script type="text/javascript">
	function checkPasswordMatch() {
		var password = $("#txtNewPassword").val();
		var confirmPassword = $("#txtConfirmPassword").val();

		if (password != confirmPassword)
			$("#divCheckPasswordMatch").html("Passwords do not match!");
		else
			$("#divCheckPasswordMatch").html("Passwords match.");
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Register page</title>
</head>
<body>
	<div class="container">
		<h1>Sign Up</h1>
		<p>Please fill the below details to create your account</p>
		<hr>

		<c:url var="myAction1" value="confirmReg.obj" />
		<form:form action="${myAction1}" method="post"
			modelAttribute="register">
			New Login	:	<form:input path="username" />
			New Password		:	<form:input path="password" />
			<input type="submit" value="CREATE" />
		</form:form>

		<!-- <label for="username"><b>Username</b></label> <input type="text"
			placeholder="Enter your username" name="username" required> -->

		<!--     <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" id="confirm_psw" required>
     -->
		<!-- <div class="td">
			<label for="txtNewPassword"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" id="txtNewPassword" />
		</div>
		<div class="td">
			<label for="txtConfirmPassword"><b>Retype Password</b></label> <input
				type="password" placeholder="Retype the Password"
				id="txtConfirmPassword" onkeyup="checkPasswordMatch();" />
		</div>
		<div class="registrationFormAlert" id="divCheckPasswordMatch"></div>

		<div class="clearfix">
			<button type="button" class="cancelbtn">Cancel</button>
			<button type="submit" class="signupbtn">Sign Up</button>
		</div> -->
	</div>






	<%-- <h1>Welcome to the Registration page</h1>
	<c:url var="myAction1" value="confirmReg.obj" />
	<form:form action="${myAction1}" method="post" modelAttribute="register">
			New Login	:	<form:input path="username"/>
			New Password		:	<form:input path="password"/>
			<input type="submit" value="CREATE" />
	</form:form> --%>
</body>
</html>