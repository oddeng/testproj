<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>

  <div class="wrapper">
<div class="container">
<h1>Welcome</h1>
<p style="color: red;">${errorString}</p>
<form class="form" method="POST" action="${pageContext.request.contextPath}/login">
<div>
<input type="text" placeholder="Username" name="userName" value="${user.userName}">
</div>
<div>
<input type="password" placeholder="Password" name="password" value="${user.password}">
</div>
<input type="checkbox" name="rememberMe" value="Y" />
<button type="submit" id="login-button">Login</button>
</form>
</div>
<ul class="bg-bubbles">
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
<li></li>
</ul>
</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
  
</body>
</html>