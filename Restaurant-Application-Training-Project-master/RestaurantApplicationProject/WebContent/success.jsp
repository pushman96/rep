<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body {
	background-image: url("images/straw.jpg");
	background-color: #cccccc;
	background-repeat: no-repeat;
	background-size: 1366px 720px;
}

h1 {
	color: green;
	font-size: 300%;
	/* text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black; */
}

h2 {
	color: black;
	font-size: 100%;
	text-shadow: -1px 0 white, 0 1px white, 1px 0 white, 0 -1px white;
}

div.a {
	padding: 80px 0;
	text-align: center;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Veg/NonVeg</title>
</head>
<body>
	<div class="a">
		<img src="images/burger.jpg" alt="done" width="200" height="200">
		<!-- <div class="w3-panel w3-black"> -->
		<h1>Login Success!</h1>
		<!-- </div> -->
		<h2>Please select one:</h2>

		<button onclick="location.href = 'vegmenu.obj';"
			class="w3-button w3-teal w3-round-large">Veg</button>
		<button onclick="location.href = 'nonvegmenu.obj';"
			class="w3-button w3-red w3-round-large">Non Veg</button>
	</div>
</body>
</html>