<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.PlayerDTO"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<%
		//List<PlayerDTO> listPlayer = (List<PlayerDTO>) request.getAttribute("player");
	PlayerDTO playerDTO = new PlayerDTO();
	%>

</head>
<body>

	<h1>Welcome player</h1>

	<h2>non puoi fare un c***o :)</h2>

	<div class="row">

<%
//PROTEZIONE
if((playerDTO.getId()) == 0){
	System.out.println("id non presente");
}
%>

		<table>




<tr><td>id</td><td><%=playerDTO.getId()%></td></tr>
<tr><td>Id Player</td><td><%=playerDTO.getIdPlayer()%></td></tr>
<tr><td>Nickname</td><td><%=playerDTO.getNickname() %></td></tr>
<tr><td>Password</td><td><%=playerDTO.getPassword() %></td></tr>
<tr><td>Player type</td><td><%=playerDTO.getPlayertype() %></td></tr>
<tr><td>Score</td><td><%=playerDTO.getScore()%></td></tr>

		<%System.out.println("ciao... " + playerDTO.getIdPlayer()); %>	
			


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