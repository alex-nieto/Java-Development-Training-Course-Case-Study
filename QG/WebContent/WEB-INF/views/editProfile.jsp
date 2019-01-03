<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>
<%@ include file="nav.jsp" %>
<style><%@ include file="css/main.css" %></style>
</head>
<body>

<div class="container">
<h2>Edit Profile:</h2>
<form action="profile" method="post">

	<label for="fname">First Name:</label>
    <input type="text" name="fname" placeholder="Your name..">

    <label for="lname">Last Name:</label>
    <input type="text" name="lname" placeholder="Your last name..">
    
    <label for="uname">User Name (used on your reviews in place of your name):</label>
    <input type="text" name=uname placeholder="Your user name...">

    <label for="email">Email:</label>
    <input type="email" name="email" placeholder="Your email..">
    
    <label for="password">Password:</label>
    <input type="password" name="password" placeholder="Your password...">

	<label for="gender">Gender:</label><br>
	<select name="gender" style="width:200px;">
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="nonbinary">Nonbinary</option>
        <option value="genderqueer">Genderqueer</option>
        <option value="genderfluid">Genderfluid</option>
      </select><br>
      
	<label for="sex">Sex:</label><br>
	<select name="sex" style="width:200px;">
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="intersex">Intersex</option>
      </select><br>

	<label for="transgender">Are you transgender?</label><br>
	<input type="radio" name="transgender" value="true"/>Yes
	<input type="radio" name="transgender" value="false"/>No<br><br>

	<label for="sexOrientation">What is your sexual orientation?</label><br>
	<select name="sexOrientation" style="width:200px;">
        <option value="Lesbian">Lesbian</option>
        <option value="Gay">Gay</option>
        <option value="Bisexual">Bisexual</option>
        <option value="Pansexual">Pansexual</option>
        <option value="Asexual">Asexual</option>
        <option value="Queer">Queer</option>
        <option value="Heterosexual">Heterosexual</option>
      </select><br>

	<label for="latinx">Are you Latinx (Hispanic)?</label><br>
	<input type="radio" name="latinx" value="true"/>Yes
	<input type="radio" name="latinx" value="false"/>No<br><br>

	<label for="race">Race:</label><br>
	<select name="race" style="width:200px;">
        <option value="American Indian or Alaska Native">American Indian or Alaska Native</option>
        <option value="Asian">Asian</option>
        <option value="Black or African American">Black or African American</option>
        <option value="Native Hawaiian or Other Pacific Islander">Native Hawaiian or Other Pacific Islander</option>
        <option value="White">White</option>
      </select><br>

	<input type="submit" value="Save" name="Save"/>
</form>
</div>
</body>
<%@ include file="footer.html" %>
</html>