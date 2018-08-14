<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="DimGrey">
	<form action="AddStudent">
		<table align="center" cellspacing="20" bgcolor="LightBlue">
			<tr>
				<td>
					Student Name:
				</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>
					Student USN:
				</td>
				<td>
					<input type="text" name="usn">
				</td>
			</tr>
			<tr>
				<td>
					Student Branch:
				</td>
				<td>
					<input type="text" name="branch">
				</td>
			</tr>
			<tr>
				<td>
					Student Sem:
				</td>
				<td>
					<input type="number" name="sem">
				</td>
			</tr>
			<tr>
				<td>
					Student Gender:
				</td>
				<td>
					<input type="text" name="gender">
				</td>
			</tr>
			<tr>
				<td>
					Total Fees:
				</td>
				<td>
					<input type="number" name="totalfees">
				</td>
			</tr>
			<tr>
				<td>
					Fees Paid:
				</td>
				<td>
					<input type="number" name="feespaid">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>