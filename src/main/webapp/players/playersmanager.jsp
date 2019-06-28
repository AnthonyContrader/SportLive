<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.PlayersDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Players Manager</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>

<div class="navbar">
  <a  href="homecoach.jsp">Home</a>
  <a class="active" href="CoachServlet?mode=playerslist">Users</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
	out.println("sono qui");
		List<PlayersDTO> list = (List<PlayersDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>nickname</th>
			<th>password</th>
			<th>playertype</th>
			<th>score</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (PlayersDTO u : list) {
		%>
		<tr>
			<td><a href=PlayersServlet?mode=read&id=<%=u.getId()%>>
					<%=u.getnickname()%>
			</a></td>
			<td><%=u.getpassword()%></td>
			<td><%=u.getplayertype()%></td>
			<td><%=u.getscore()%></td>
			<td><a href=CoachServlet?mode=read&update=true&id=<%=u.getId()%>>Edit</a>
			</td>
			<td><a href=CoachServlet?mode=delete&id=<%=u.getId()%>>Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>





</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>