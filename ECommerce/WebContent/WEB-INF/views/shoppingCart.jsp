<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/cart.css">
</head>

<body>
	<div class="header">
		<div class="logo">
			<h1>Shopping Cart</h1>
		</div>

		<div id="page">
			<table border="1" cellpadding="5" cellspacing="1">
				<tr>
					<th>Code</th>
					<th>Name</th>
					<th>Product</th>
					<th>Quantity</th>
					<th>Price</th>




				</tr>
				<c:forEach items="${productList}" var="product">
					<tr>
						<td>${product.code}</td>
						<td>${product.name}</td>
						<td>${product.product}</td>
						<td>${product.price}</td>
						<td>${product.quantity}</td>

					</tr>
				</c:forEach>
			</table>
</body>
</html>