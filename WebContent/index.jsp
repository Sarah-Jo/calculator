<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DART TC</title>
</head>
<body>
<h2><font color="brown">Summing number 1 and 2</font></h2>
	<form action="HelloForm" method="POST">
	<font color="green"><br><i>Number 1:</i></font><input type="text"name="leftvalue">
	<font color="green"><br><i>Number 2:</i></font><input type="text"name="rightvalue">
	<input type="submit" value="Submit" />
	<script>
		window.alert(leftvalue + rightvalue);
	</script>
	</form>
</body>
</html>