<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password </a>&nbsp &nbsp

	<a href="./updateprofile">Update Profile</a>&nbsp &nbsp

	<a href="./delete">Delete Profile</a>&nbsp &nbsp

	<a href="./logout">Logout</a>

	<h2>
		Welcome <%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
			<table align="center">
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id" value="id"
						placeholder="enter id"></td>
					<td><input type="submit" name="submit" value="Search"></td>
				</tr>
			</table>

		</form>

	</fieldset>
<%
	EmployeeBean employeeBean = (EmployeeBean)request.getAttribute("bean");
%>
<%
if(employeeBean!=null){
	%>
	
	<table align="center">
	  <tr>
	    <th>Name</th>
	    <th>Email</th>
	    <th>Gender</th>
	    <th>DOJ</th>
	  </tr>
	  <tr>
	    <td><%=employeeBean.getName()%></td>
	    <td><%=employeeBean.getEmail()%></td>
	    <td><%=employeeBean.getGender()%></td>
	    <td><%=employeeBean.getDoj()%></td> 	   
	  </tr>
	</table>
	
	<%
}
	%>	
	<h3>${msg}</h3>

</body>
</html>