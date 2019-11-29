<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset align="center">

		<form action="./form" method="post">
			<table align="center">
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id" value="id"
						placeholder="enter id"></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" value=""
						placeholder="enter name"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" value=""
						placeholder="enter password"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input type="text" name="gender" value=""
						placeholder="enter gender"></td>
				</tr>
				
				<tr>
					<td>Doj:</td>
					<td><input type="date" name="doj"></td>
         		</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" name="submit" value="Register"></td>
				</tr>
				


			</table>

		</form>
	</fieldset>
</body>

</html>