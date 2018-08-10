<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4caf8a;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

/* .cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #af4c4c;
}
 */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

</style>
</head>
<body>

<h2>Login Form</h2>


  <div class="imgcontainer">
    <img src="images/food1.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
  <c:url var="myAction" value="checkLogin.obj" />
	<form:form action="${myAction}" method="post" modelAttribute="login">
			Login	:	<form:input path="username"/>
			Password		:	<form:input type = "password" path="password"/>
			<input type="submit" value="LOGIN" />
	</form:form>
  </div>
	
  <div class="container" style="background-color:#f1f1f1">
    <!-- <button type="button" class="cancelbtn">Cancel</button> -->
    <span><a href="register.obj">New User? </a></span>
  </div>


</body>
</html>








<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<h1>Welcome to the Login page</h1>
	<c:url var="myAction" value="checkLogin.obj" />
	<form:form action="${myAction}" method="post" modelAttribute="login">
			Login	:	<form:input path="username"/>
			Password		:	<form:input type = "password" path="password"/>
			<input type="submit" value="LOGIN" />
	</form:form>
</body>
</html> --%>