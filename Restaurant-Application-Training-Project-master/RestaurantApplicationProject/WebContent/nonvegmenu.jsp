<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.demo-center {
	width: 200px;
	margin: 0 auto;
}

.plus-minus-input { .input-group-field { margin-left:0.5rem;
	margin-right: 0.5rem;
	padding: 1rem;
	&::
	-webkit-inner-spin-button
	,
	:
	:
	-webkit-outer-spin-button
	{
	
	
      
	
	appearance
	:
	
	 
	
	none;
}

}
.input-group-button { .circle { border-radius:50%;
	padding: 0.25em 0.8em;
}
}
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js">
	jQuery(document).ready(
			function() {
				// This button will increment the value
				$('[data-quantity="plus"]').click(
						function(e) {
							// Stop acting like a button
							e.preventDefault();
							// Get the field name
							fieldName = $(this).attr('data-field');
							// Get its current value
							var currentVal = parseInt($(
									'input[name=' + fieldName + ']').val());
							// If is not undefined
							if (!isNaN(currentVal)) {
								// Increment
								$('input[name=' + fieldName + ']').val(
										currentVal + 1);
							} else {
								// Otherwise put a 0 there
								$('input[name=' + fieldName + ']').val(0);
							}
						});
				// This button will decrement the value till 0
				$('[data-quantity="minus"]').click(
						function(e) {
							// Stop acting like a button
							e.preventDefault();
							// Get the field name
							fieldName = $(this).attr('data-field');
							// Get its current value
							var currentVal = parseInt($(
									'input[name=' + fieldName + ']').val());
							// If it isn't undefined or its greater than 0
							if (!isNaN(currentVal) && currentVal > 0) {
								// Decrement one
								$('input[name=' + fieldName + ']').val(
										currentVal - 1);
							} else {
								// Otherwise put a 0 there
								$('input[name=' + fieldName + ']').val(0);
							}
						});
			});
</script>
<title>Non-Veg</title>
</head>
<body>
	<c:url var="myAction" value="bill.obj" />
	<form:form action="${myAction}" method="get" modelAttribute="billing">
		<div data-role="page" id="pageone">
			<div data-role="header">
				<h1>Non-Veg Menu</h1>
			</div>
			<div data-role="main" class="ui-content">
				<div data-role="collapsible">
					<h1>Starters</h1>
					<table cellspacing="20">
						<tr>
							<th>Name</th>
							<th>Price</th>
							<th>Available Quantity</th>
							<th>Quantity Selected</th>
						</tr>
						<c:forEach var="items" items="${veg}" begin="0" end="2">
							<tr>
								<td align="center">${items.dishname}</td>
								<td align="center">${items.price}</td>
								<td align="center">${items.quant}</td>
								<td width="25%" align="right"><div
										class="input-group plus-minus-input">
										<input class="input-group-field" align="right" type="number"
											name="quantity" value="0" min="0" max="15">
									</div></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<div data-role="main" class="ui-content">
				<div data-role="collapsible">
					<h1>Main Course</h1>
					<div data-role="main" class="ui-content">
						<div data-role="collapsible">
							<h1>Indian Breads</h1>
							<table cellspacing="20">
								<tr>
									<th>Name</th>
									<th>Price</th>
									<th>Available Quantity</th>
									<th>Quantity Selected</th>
								</tr>
								<c:forEach var="items" items="${veg}" begin="3" end="5">
									<tr>
										<td align="center">${items.dishname}</td>
										<td align="center">${items.price}</td>
										<td align="center">${items.quant}</td>
										<td width="25%" align="right"><div
												class="input-group plus-minus-input">
												<input class="input-group-field" align="right" type="number"
													name="quantity" value="0" min="0" max="15">
											</div></td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
					<div data-role="main" class="ui-content">
						<div data-role="collapsible">
							<h1>Gravy</h1>
							<table cellspacing="20">
								<tr>
									<th>Name</th>
									<th>Price</th>
									<th>Available Quantity</th>
									<th>Quantity Selected</th>
								</tr>
								<c:forEach var="items" items="${veg}" begin="6" end="8">
									<tr>
										<td align="center">${items.dishname}</td>
										<td align="center">${items.price}</td>
										<td align="center">${items.quant}</td>
										<td width="25%" align="right"><div
												class="input-group plus-minus-input">
												<input class="input-group-field" align="right" type="number"
													name="quantity" value="0" min="0" max="15">
											</div></td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
				</div>
			</div>
			
					<div>
					<input type="submit" value="Proceed to checkout"  />
					</div>
		</div>
	
	</form:form>
</body>
</html>