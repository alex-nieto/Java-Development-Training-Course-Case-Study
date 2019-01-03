<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Write a Review</title>
<%@ include file="nav.jsp" %>
<style><%@ include file="css/main.css" %></style>
</head>
<body>

<div class="container">
<h2>Your Review</h2>
<form action="" method="post">
<table>

<tr><td>Company:</td><td>
<select name="company">
        <option value="Company1">Company1</option>
        <option value="Company2">Company2</option>
        <option value="Company3">Company3</option>
      </select>
</td></tr><tr></tr>
<tr><td>Overall Rating:</td>
	<td><input type="radio" name="rating" value="1"/>1
	<input type="radio" name="rating" value="2"/>2
	<input type="radio" name="rating" value="3"/>3
	<input type="radio" name="rating" value="4"/>4
	<input type="radio" name="rating" value="5"/>5</td>
</tr><tr></tr><tr></tr>
<tr><td>Do you consider it LGBTQ+ safe?</td>
	<td><input type="radio" name="safe" value="yes"/>Yes
	<input type="radio" name="safe" value="no"/>No</td>
</tr><tr></tr>
<tr><td>Is it safe for transgender people?</td>
	<td><input type="radio" name="tsafe" value="yes"/>Yes
	<input type="radio" name="tsafe" value="no"/>No</td>
</tr><tr></tr>
<tr><td>Any other notes?</td><td><textarea name="notes" style="width: 300px;height:100px"></textarea></td></tr>
<tr></tr>
<tr>
<td colspan="2"><input type="submit" value="Submit Review" name="submit"/></td>
</tr>

</table>
</form>
</div>
</body>
<%@ include file="footer.html" %>
</html>