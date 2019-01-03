<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<%@ include file="nav.jsp" %>
<style><%@ include file="css/main.css" %></style>
</head>
<body>

<div class="container">
<h2>Your Profile</h2>

<table>

<tr><td>First Name:</td><td>
</td></tr><tr></tr>
<tr><td>Last Name:</td><td>
</td></tr><tr></tr>
<tr><td>User Name:</td><td>
</td></tr><tr></tr>
<tr><td>Email:</td><td>
</td></tr><tr></tr>
<tr><td>Password:</td>
<td></td></tr><tr></tr>

<tr><td>Gender:</td><td>
</td></tr><tr></tr>

<tr><td>Sex:</td><td>
</td></tr><tr></tr>

<tr><td>Are you transgender?</td>
	<td></td>
</tr><tr></tr>

<tr><td>What is your sexual orientation?</td><td>
</td></tr><tr></tr>

<tr><td>Are you Latinx (Hispanic)?</td>
	<td></td>
</tr><tr></tr>

<tr><td>Race:</td><td>
</td></tr><tr></tr>

</table>

<form action="editProfile" method="post">
<input type="submit" value="Edit" name="Edit"/>
</form>
</div>

</body>
<%@ include file="footer.html" %>
</html>