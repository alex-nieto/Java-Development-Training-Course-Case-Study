<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Companies</title>
<%@ include file="nav.jsp" %>
<style><%@ include file="css/main.css" %></style>
</head>
<body>
<h2>Company Ratings and Reviews:</h2>
<div class="container">
<form action="">
<table>
<tr><td>Company:</td><td>
</td></tr><tr></tr>
<tr><td>Overall Rating:</td>
	<td></td>
</tr><tr></tr><tr></tr>
<tr><td>LGBTQ+ safe?</td>
	<td></td>
</tr><tr></tr>
<tr><td>Safe for transgender people?</td>
	<td></td>
</tr><tr></tr>
<tr>
<td colspan="2"><input type="submit" value="View Reviews" name="reviews"/></td>
</tr>
</table>
</form>
</div>
<p><br></p>

</body>
<%@ include file="footer.html" %>
</html>