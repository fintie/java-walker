<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/new" method="POST">
		<table border = "1" cellpadding="10" cellspacing="0">
			<tr>
				<td colspan="8">Register Information</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>Role</td>
				<td>
					<select name="role">
						<option value="Admin">Admin</option>
					    <option value="Client">Client</option>
					    <option value="Walker">Walker</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="8"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>