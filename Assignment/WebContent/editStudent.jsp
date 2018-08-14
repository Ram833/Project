<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightBlue">
<%
	String name = (String)session.getAttribute("NAME");
	String totalfees = (String)session.getAttribute("TOTALFEES");
	int remainingfees = (Integer)session.getAttribute("REMAININGFEES");
	
	out.println("               "+name+"<br>"+"<br>");
	out.println("Total Fees:     Rs. "+totalfees+"<br>");
	out.println("Remaining Fees: Rs. "+remainingfees+"<br>");
%>
	<form action="EditStudent">
		<table>
			<tr>
				<td>
					Fees Paid:
				</td>
				<td>
					<input type="number" name="feespaid" min="1">
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