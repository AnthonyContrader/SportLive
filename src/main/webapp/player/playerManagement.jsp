<%@page import="it.contrader.dto.UserDTO"%>
<%@ page import="java.util.List"%>
<%@	page import="it.contrader.dto.PlayerDTO"%>
<%-- <jsp:include page="/player/playerManagement" flush="true"/> --%>
<%
	UserDTO userDTO = (UserDTO) request.getSession().getAttribute("utenteCollegato");
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
					href="/player/deletePlayer?id=<%=player.getId()%>">Delete</a></td>
				<td><a class="btn btn-primary btn-lg btn-block"
					href="/player/redirectUpdate?id=<%=player.getId()%>">Update</a></td>
			</tr>
			<%
				}
			%>
		</table>
		<a class="btn btn-primary btn-lg btn-block"
			href="/player/insertPlayer.jsp">Insert new Player</a> <br> <a
			class="btn btn-primary btn-lg btn-block" href="/homeCoach.jsp">Back
			to home</a> <br>
	</div>
</div>


