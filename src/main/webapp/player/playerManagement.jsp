<%@ page import="java.util.List"%>
<%@	page import="it.contrader.dto.PlayerDTO"%>
<%
	List<PlayerDTO> listPlayer = (List<PlayerDTO>) request.getAttribute("listPlayer");
%>

<div class="row">
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
		<table class="table table-striped">
			<tr>
				<th>Id</th>
				<th>UserName</th>
				<th>Name</th>
				<th>Type</th>
				<th>Score</th>
				<th colspan="2">Manage</th>
			</tr>
			<%
				for (PlayerDTO player : listPlayer) {
			%>
			<tr>
				<td><%=player.getId()%></td>
				<td><%=player.getUsername()%></td>
				<td><%=player.getUserPlayer().getName()%> <%=player.getUserPlayer().getSurname()%></td>
				<td><%=player.getPlayertype().name()%></td>
				<td><%=player.getScore()%></td>
				<td><a class="btn btn-primary btn-lg btn-block"
					href="/Player/deletePlayer?id=<%=player.getId()%>">Delete</a></td>
				<td><a class="btn btn-primary btn-lg btn-block"
					href="/Player/redirectUpdate?id=<%=player.getId()%>">Update</a></td>
			</tr>
			<%
				}
			%>
		</table>
		<a class="btn btn-primary btn-lg btn-block"
			href="/player/insertPlayer.jsp">Insert new Player</a> <br> <a
			class="btn btn-primary btn-lg btn-block" href="/homeAdmin.jsp">Back
			to home</a> <br>
	</div>
</div>


