<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.PlayerDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%
	List<PlayerDTO> listPlayer = (List<PlayerDTO>) request.getAttribute("player");
%>

</head>
<body>

	<h1>Welcome player</h1>

	<h2>non puoi fare un c***o :)</h2>

	<div class="row">

		<table>

			<tr>
				<th>id</th>
				<th>id player</th>
				<th>nickname</th>
				<th>password</th>
				<th>playertype</th>
				<th>score</th>
			</tr>

			<%
				for (PlayerDTO player : listPlayer) {
			%>


<tr>
		 		<td><%=player.getId()%></td>
		 		<td><%=player.getIdPlayer()%></td>
		 		<td><%=player.getNickname()%></td>
		 		<td><%=player.getPassword()%></td>
		 		<td><%=player.getScore()%></td>

</tr>
			<%
				}
			%>
		</table>

	</div>







	<nav class='navbar navbar-inverse'>
		<div class='container-fluid'>
			<ul class='nav navbar-nav navbar-inverse navbar-custom'>
				<li><a href="/Home/logout/">Vattene!</a></li>
			</ul>
		</div>
	</nav>

</body>
</html>