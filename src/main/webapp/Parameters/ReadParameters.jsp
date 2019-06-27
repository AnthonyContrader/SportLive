<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="it.contrader.dto.ParametersDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Parameters</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a class="active"  href="ParametersServlet?mode=userlist">Parameters</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>

<div class="main">
<%ParametersDTO u = (ParametersDTO) request.getAttribute("dto");%>


<table>
	<tr> 

		<th>data</th>
		<th>age</th>
		<th>height</th>
		<th>weight</th>
		<th>gol</th>
		<th>gp</th>
		<th>mp</th>
	</tr>
	<tr>

		
		<td><%=u.getData()%></td>
		<td><%=u.getAge()%></td>
		<td><%=u.getHeight()%></td>
		<td><%=u.getWeight()%></td>
		<td><%=u.getGol()%></td>
		<td><%=u.getGp()%></td>
		<td><%=u.getMp()%></td>
		
		 
	</tr>	
</table>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


</div>

<%@ include file="../css/footer.jsp" %>
</body>
</html>