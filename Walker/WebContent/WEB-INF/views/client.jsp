<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<spring:url value="/resources/css/client.css" var="crunchifyCSS" />
<link href="${crunchifyCSS}" rel="stylesheet" />
<link rel="stylesheet" href = "http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<title>Client Page</title>
</head>
<body>
	<div class="login">
		<h2>Welcome ${walker.username}</h2>
		<div class="login-top">
			<h1>Jobs Publish</h1>
			<form action="${pageContext.request.contextPath }/client/publish"
				method="POST">
				<input type="hidden" name="id" value="${walker.id }"> 
				<!-- <input type="hidden" name="_method" value="PUT" />  -->
				<input type="text"
					value="Job Namne" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Job Name';}"
					name="name">
				<textarea rows="10" cols="20" name="description"></textarea>
				<div class="forgot">
					<input type="submit" value="Submit">
				</div>
			</form>
		</div>
		<div class="login-bottom">
			<h3>
				<a href="">Update</a>&nbsp Personal Details
			</h3>
		</div>
	</div>
	<div class="copyright">
		<p>Copyright &copy; 2015.FINITE All rights reserved.</p>
	</div>
</body>
</html>