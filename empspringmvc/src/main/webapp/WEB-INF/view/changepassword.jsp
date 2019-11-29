<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <a href="./home">Home</a>&nbsp &nbsp
	<a href="./logout"style="float:right;">Logout</a>
    <fieldset>
		<legend>Change password</legend>
		<form action="./changepassword" method="post">
			<table align="center">
				<tr>
					<td>New Password:</td>
					<td><input type="password" name="password" value=""
						placeholder="enter password"></td>
				</tr>
				
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmpassword" value=""
						placeholder="enter password again"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" name="submit" value="Change"></td>
				</tr>
				
			</table>

		</form>
		
	</fieldset>
</body>
</html>