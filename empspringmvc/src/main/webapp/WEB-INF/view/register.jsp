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
		<legend>Register</legend>
		<form action="./register" method="post">
			<table align="center">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" value=""
						placeholder="enter name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email" value=""
						placeholder="enter email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" value=""
						placeholder="enter password"></td>
				</tr>
				<tr>
					<td>Doj:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><select name="gender"required="required">
					<option>----select----</option>
					<option value="M">Male</option>
					<option value="F">Female</option>
					</select></td>
				</tr>
				
							
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" name="submit" value="Register"></td>
				</tr>



			</table>

		</form>

	</fieldset>
			<a href="./login">Click here to Login</a>
	
</body>

</html>