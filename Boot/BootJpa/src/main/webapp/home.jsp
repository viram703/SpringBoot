<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPring</title>
</head>
<body>
<fieldset>
<legend>Customer Detail</legend>
<form action="addCustomer">
						
						<label>Enter Customer id</label>
						<input type="text" name="id" /> <br></br>
						
						<label>Enter name:</label>
						<input type="text" name="name" /> <br></br>
						
						<label>Email:</label>
						<input type="email" name="email" /><br></br>
						<input type="submit" name="sumbit"><br>	
</form>
</fieldset>
	<form action="getCustomer">
	<input type="text" name="id" /><br></br>
</form>
</body>
</html>