<%@page import="it.contrader.dto.UserDTO"%>
<%@	page import="it.contrader.dto.PlayerDTO"%>
<%
	UserDTO userDTO = (UserDTO) request.getSession().getAttribute("utenteCollegato");
%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="row">

	<form:form method="POST" action="/player/updatePlayer" modelAttribute="playerDTO">
		<form:hidden path="idCoach" />
		<form:hidden path="playertype"/>
		<form:hidden path="id"/>
		
		<form:hidden path="coach.id"/>
		<form:hidden path="coach.username"/>
		<form:hidden path="coach.password"/>
		<form:hidden path="coach.usertype"/>
		<form:hidden path="coach.name"/>
		<form:hidden path="coach.surname"/>
		
		<form:hidden path="userPlayer.id"/>
		<form:hidden path="userPlayer.username"/>
		<form:hidden path="userPlayer.password"/>
		<form:hidden path="coach.usertype"/>
		<%-- <form:hidden path="coach.name"/> --%>
		<%-- <form:hidden path="coach.surname"/> --%>

		<table>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td><form:label path="score">Score</form:label></td>
				<td><form:input path="score"/></td>
			</tr>
			<tr>
				<td><form:label path="userPlayer.name">Name</form:label></td>
				<td><form:input path="userPlayer.name"/></td>
			</tr>
			<tr>
				<td><form:label path="userPlayer.surname">Surname</form:label></td>
				<td><form:input path="userPlayer.surname"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

<%-- 	<form class="update-form" action="/player/updatePlayer" method="post"> --%>
<!-- 		<input type="hidden" id="idCoach" name="idCoach" -->
<%-- 			value="<%=userDTO.getId()%>"> <input type="hidden" --%>
<!-- 			id="playertype" name="playertype" value="PLAYER"> -->
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td>Username</td> -->
<!-- 				<td><input type="text" name="username" placeholder="Username" -->
<%-- 					value="<%=playerDTO.getUsername()%>"></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td>Score</td> -->
<!-- 				<td><input type="text" name="score" placeholder="Score" -->
<%-- 					value="<%=playerDTO.getScore()%>"></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td>Name</td> -->
<!-- 				<td><input type="text" name="name" placeholder="Name" -->
<%-- 					value="<%=playerDTO.getUserPlayer().getName()%>"></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td>Surname</td> -->
<!-- 				<td><input type="text" name="surname" placeholder="Surname" -->
<%-- 					value="<%=playerDTO.getUserPlayer().getSurname()%>"></td> --%>
<!-- 			</tr> -->
<!-- 		</table> -->
<!-- 		<br> -->
<!-- 		<button class="btn btn-primary btn-lg btn-block" type="submit">Update</button> -->
<%-- 	</form> --%>
	<br>
</div>


