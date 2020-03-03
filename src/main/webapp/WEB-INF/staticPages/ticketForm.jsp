<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>RAISE TICKETS</h4>
<form action="/saveTicket" method="POST">
<table>

<tr>
<td><label for="description"><b>DESCRIPTION</b></label></td>
<td><input type="text" placeholder="Enter Description" name=description></td>
</tr>

<tr>
<td><label for="priority"><b>PRIORITY</b></label></td>
<td>
<select id="priority" name=priority>
<option value="low">Low</option>
<option value="high">High</option>
</select>
</td>
</tr>


<tr>
<td><label for="status"><b>STATUS</b></label></td>
<td><input type="readonly"  name=status value="New" readonly="readonly"></td>
</tr>



<tr>
<td>
<input type="submit" value="submit">
<input type="reset" value="clear">
</td>
</tr>

</table>
</form>
</body>
</html>