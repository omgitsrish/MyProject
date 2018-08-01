<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	function add(){
		var total = parseInt(document.getElementById("basic").value)+ parseInt(document.getElementById("food").value)+ parseInt(document.getElementById("performance").value)- parseInt(document.getElementById("income").value);
		document.getElementById("total").value =total ;
	}

</script>
<body>
	<% if(request.getAttribute("success")!=null){%>
			<font color="green"><%= request.getAttribute("success") %></font>
	<%}
	else if(request.getAttribute("fail")!=null)
	{
	%>
		<font color="red"><%= request.getAttribute("fail") %></font>
	<%} %>
		
		
	<form action="Controller" method="get">
	<input type="hidden" name="action" value="addSal"> 
		<table border="2" cellspacing="10" cellpadding="10">
			<th>Add Salary Details</th>
			<tr>
				<td>Employee id: <input type="number" name="empid" /> <br>
				<br> Financial Year: <select name="fyear">
						<option>2016-17</option>
						<option>2017-18</option>
						<option>2018-19</option>
				</select> Month: <select name="month">
						<option>Jan</option>
						<option>Feb</option>
						<option>Mar</option>
				</select>
			</tr>

			<tr>
				<td>Basic Pay: <input type="number" name="basic" id="basic" value="0"  onkeyup="add()" />
					Performance Pay: <input type="number" name="performance" id="performance"  value="0" onkeyup="add()"/>
					<br>
				<br> Income Tax: <input type="number" id="income" name="income" value="0" onkeyup="add()"/>
					Food Coupon: <input type="number" name="food" id="food"  value="0" onkeyup="add()"/>

				</td>
			</tr>
			<tr>
				<td>
					Total Salary : <input type="number" name="total" id="total"  disabled="disabled" />
					<input type="submit" name="submit" value="Submit" />
					<input type="reset" name="reset" value="Cancel" />
				</td>
			</tr>
			
		</table>
	</form>
	
</body>
</html>