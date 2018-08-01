<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function view(empid){
		alert(empid);
		var fyear=document.getElementById("fyear").value;
		alert(fyear);
		var month=document.getElementById("month").value;
		alert(month);
		document.getElementById('link').href = "Controller?id="+empid+"&fyear="+fyear+"&month="+month;
	}
</script>


<body>
	<form action="Controller" method="get">
		<input type="hidden" name="action" value="fetchemp"> Employee
		Name : <input type="text" name="ename" /><br> <br>
		Designation: <select value="designation">
			<option>ACE</option>
			<option>ITA</option>
			<option>AST</option>
		</select> <input type="submit" value="Submit">
	</form>

	<%
		ArrayList<Employee> list  = (ArrayList<Employee>)request.getAttribute("list"); 
		if(list!=null){
	%>

	<table border="2">
		<tr>
			<th>View</th>
			<th>EmployeeId</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Contact Num</th>
			<th>Financial Year</th>
			<th>Month</th>
		</tr>
		<%
			for(Employee e:list){
		%>
		<tr>		
			<!--<td> <a href="Controller?id=<%=e.getEmpid()%>">View</a></td> -->
			<td><a id="link" onclick="view(<%=e.getEmpid()%>)">View</a>
			<td id="<%=e.getEmpid()%>"><%=e.getEmpid()%></td>
			<td><%=e.getEname()%></td>
			<td><%=e.getDesignation()%></td>
			<td><%=e.getContact_no()%></td>
			<td>Financial Year: <select name="fyear" id="fyear">
					<option>2016-17</option>
					<option>2017-18</option>
					<option>2018-19</option>

			</select></td>
			<td>Month: <select name="month" id="month">
					<option>Jan</option>
					<option>Feb</option>
					<option>Mar</option>
			</select></td>
		</tr>
		
	</table>
	<%
		}
	%>
	<%
		}
	%>

</body>
</html>
