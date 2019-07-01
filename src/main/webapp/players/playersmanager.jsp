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
  <a class="active" href="PlayerServlet?mode=playerslist">Players</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<PlayersDTO> list = (List<PlayersDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>Nickname</th>
			<th>Password</th>
			<th>PlayerType</th>
			<th>Score</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (PlayersDTO u : list) {
		%>
		<tr>
			<td><a href=UserServlet?mode=read&id=<%=u.getId()%>>
					<%=u.getNickname()%>
			</a></td>
			<td><%=u.getPassword()%></td>
			<td><%=u.getPlayertype()%></td>
			<td><%=u.getScore() %></td>
			
			
			<td><a href=CoachServlet?mode=read&update=true&id=<%=u.getId()%>>Edit</a>
			</td>
			<td><a href=CoachServlet?mode=delete&id=<%=u.getId()%>>Delete</a>
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="CoachServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
     <label for="pass">idcoach</label>
    </div>
    <div class="col-75">
      <input type="text" id="idcoach" name="idcoach" placeholder="inserisci idcoach"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="user">Nickname</label>
    </div>
    <div class="col-75">
      <input type="text" id="nickname" name="nickname" placeholder="inserisci nickname">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Password</label>
    </div>
    <div class="col-75">
      <input type="text" id="pass" name="password" placeholder="inserisci password"> 
    </div>
  </div>
    <div class="row">
    <div class="col-25">
     <label for="pass">Score</label>
    </div>
    <div class="col-75">
      <input type="text" id="score" name="score" placeholder="inserisci score"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="type">Playertype</label>
    </div>
   		 <div class="col-75">
 			<select id="type" name="playertype">
  				<option value="ATTACCANTE">ATTACCANTE</option>
  				<option value="CENTROCAMPO">CENTROCAMPO</option>
  				<option value="DIFENSORE">DIFENSORE</option>
 				<option value="PORTIERE">PORTIERE</option>
			</select>
    	</div>
  </div>
      <button type="submit" >Nuovo player</button>
</form>

</div>
<br>
<%@ include file="../css/footer.jsp" %>
</body>
</html>