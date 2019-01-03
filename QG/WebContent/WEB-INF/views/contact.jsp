<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
<%@ include file="nav.jsp" %>
<style><%@ include file="css/main.css" %></style>
</head>
<body>

<div class="container">
<h2>Contact Form</h2>
  <form action="">
    <label for="fname">First Name:</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">

    <label for="lname">Last Name:</label>
    <input type="text" id="lname" name="lastname" placeholder="Your last name..">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" placeholder="Your email..">
    
    <label for="subject">Subject:</label>
    <input type="text" id="subject" name="subject" placeholder="Subject..">

    <label for="message">Message:</label>
    <textarea id="message" name="message" placeholder="Write something.." style="height:200px"></textarea>

    <input type="submit" value="Submit">
  </form>
</div>

</body>
<%@ include file="footer.html" %>
</html>