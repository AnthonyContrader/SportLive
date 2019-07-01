<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.PlayersDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Edit Player</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
  <a href="homecoach.jsp">Home</a>
  <a class="active" href="CoachServlet?mode=playerslist">Annulla</a>
 <!--  <a href="LogoutServlet" id="logout">Logout</a>  -->
</div>
<br>
<div class="main">

<%PlayersDTO u = (PlayersDTO) request.getAttribute("dto");%>


<form id="floatleft" action="CoachServlet?mode=update&id=<%=u.getId()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">idcoach</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="idcoach" value=<%=u.getIdcoach()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="user">Username</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="username" value=<%=u.getNickname()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Password</label>
    </div>
    <div class="col-75">
      <input
			type="text" id="pass" name="password" value=<%=u.getPassword()%>> 
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="user">Punteggio</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="score" value=<%=u.getScore()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="type">Usertype</label>
    </div>
   		 <div class="col-75">
 			<select id="type" name="usertype">
  				<option value="ATTACCANTE" <%if(u.getPlayertype().equals("ATTACANTE")) {%>selected<%}%>>ATTACANTE</option>
  				<option value="CENTROCAMPO" <%if(u.getPlayertype().equals("CENTROCAMPO")) {%>selected<%}%>>CENTROCAMPO</option>
  				<option value="DIFENSORE" <%if(u.getPlayertype().equals("DIFENSORE")) {%>selected<%}%>>DIFENSORE</option>
  				<option value="PORTIERE" <%if(u.getPlayertype().equals("PORTIERE")) {%>selected<%}%>>PORTIERE</option>
			</select>
    	</div>
  </div>
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="../css/footer.jsp" %>	
</body>
</html>