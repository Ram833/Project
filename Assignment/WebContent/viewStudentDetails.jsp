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
	String usn = (String)session.getAttribute("USN");
	String branch = (String)session.getAttribute("BRANCH");
	String sem = (String)session.getAttribute("SEM");
	String gender = (String)session.getAttribute("GENDER");
	String totalfees = (String)session.getAttribute("TOTALFEES");
	String feespaid = (String)session.getAttribute("FEESPAID");
	int remainingfees = (Integer)session.getAttribute("REMAININGFEES");
	
	out.println("Name:               "+name+"<br>");
	out.println("USN:                "+usn+"<br>");
	out.println("Branch:             "+branch+"<br>");
	out.println("Gender:             "+gender+"<br>");
	out.println("Total Fees:     Rs. "+totalfees+"<br>");
	out.println("Fees Paid:      Rs. "+feespaid+"<br>");
	out.println("Remaining Fees: Rs. "+remainingfees+"<br>");
	%>
	<form action="">
		<table>
			<tr>
				<td>
					<a href="editStudent.jsp">
						<input type="button" value="Edit">
					</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>