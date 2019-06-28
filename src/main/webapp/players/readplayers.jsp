<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.PlayersDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Read Players</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a class="active"  href="UserServlet?mode=userlist">Users</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>

<div class="main">
<%PlayersDTO u = (PlayersDTO) request.getAttribute("dto");%>


<table>
	<tr> 
		<th>Nickname</th>
		<th>Password</th>
		<th>Playertype</th>
	</tr>
	<tr>
		<td><%=u.getnickname()%></td>
		<td> <%=u.getpassword()%></td>
		<td> <%=u.getplayertype()%></td>
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