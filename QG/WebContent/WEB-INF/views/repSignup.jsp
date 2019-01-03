<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<%@ include file="nav.jsp" %>
<style><%@ include file="css/main.css" %></style>
</head>
<body>

<div class="container">
<h2>Sign Up</h2>
<form action="rep-signup-complete" method="post">

	<label for="fname">First Name:</label>
    <input type="text" name="fname" placeholder="Your name..">

    <label for="lname">Last Name:</label>
    <input type="text" name="lname" placeholder="Your last name..">
    
    <label for="uname">User Name (used on your review replies in place of your name):</label>
    <input type="text" name=uname placeholder="Your user name...">

    <label for="email">Company Email:</label>
    <input type="email" name="email" placeholder="Your email..">
    
    <label for="password">Password:</label>
    <input type="password" name="password" placeholder="Your password...">
    
    <label for="title">Title</label>
    <input type="text" name="title" placeholder="Your job title...">
    
    <label for="title">Company</label>
    <input type="text" name="company" placeholder="Your company...">

	<label for="safe">Declaring as LGBTQ+ safe?</label>
	<input type="radio" name="safe" value="yes"/>Yes
	<input type="radio" name="safe" value="no"/>No<br><br>

	<label for="tsafe">Is your company safe for transgender people?</label>
	<input type="radio" name="tsafe" value="yes"/>Yes
	<input type="radio" name="tsafe" value="no"/>No<br><br>

	<label for="disclosure">Do you agree to allow this site to change your company's safety status based on customer reviews?</label>
	<input type="radio" name="disclosure" value="yes"/>Yes
	<input type="radio" name="disclosure" value="no"/>No<br><br>

	<input type="submit" value="Sign Up" name="Signup"/>
</form>
</div>
</body>
<%@ include file="footer.html" %>
</html>