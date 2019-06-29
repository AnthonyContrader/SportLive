<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.ParametersDTO"%>
	
	
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
  <a class="active" href="CoachServlet?mode=playerslist">Indietro</a>
</div>
<div class="main">
	<%
		List<ParametersDTO> list = (List<ParametersDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>ID Player</th>
			<th>Età</th>
			<th>Altezza</th>
			<th>Peso</th>
			<th>N. Gol</th>
			<th>Partite</th>
			<th>Minuti di gioco</th>
			<th></th>
		</tr>
		<%
			for (ParametersDTO u : list) {
		%>
		<tr>
			<td><a href=PlayersServlet?mode=read&id=<%=u.getIdplayer()%>>
					<%=u.getAge()%>
			</a></td>
			<td><%=u.getHeight()%></td>
			<td><%=u.getWeight()%></td>
			<td><%=u.getGol()%></td>
			<td><%=u.getGp() %></td>
			<td><%=u.getMp() %></td>
		

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