<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="it.contrader.dto.PlayersDTO"
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>New Palyer</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a class="active" href="UserServlet?mode=userlist">Annulla</a>
</div>
<br>
<div class="main">

<%PlayersDTO u = (PlayersDTO) request.getAttribute("dto");%>



<form id="floatright" action="CoachServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">Nickname</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="username" placeholder="inserisci nickname">
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
      <label for="type">Playertype</label>
    </div>
   		 <div class="col-75">
 			<select id="type" name="playertype">
  				<option value="ADMIN">ATTACCANTE</option>
  				<option value="COACH">CENTROCAMPO</option>
  				<option value="DEVICE">DIFENSORE</option>
 				<option value="PARAMETERS">PORTIERE</option>
			</select>
    	</div>
  </div>
      <button type="submit" >Crea</button>
</form>



<!-- 
<tr>
<td>



<form id="floatright" action="ParametersServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">Età</label>
    </div>
    <div class="col-75">
      <input type="text" id="age" name="playerage" placeholder="inserisci età giocatore">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Altezza</label>
    </div>
    <div class="col-75">
      <input type="text" id="height" name="playerheight" placeholder="inserisci altezza giocatore"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Peso</label>
    </div>
    <div class="col-75">
      <input type="text" id="weight" name="playerweight" placeholder="inserisci peso giocatore"> 
    </div>
  </div>
    <div class="row">
    <div class="col-25">
     <label for="pass">Gol</label>
    </div>
    <div class="col-75">
      <input type="text" id="gol" name="playergol" placeholder="inserisci gol segnati"> 
    </div>
  </div>
      <div class="row">
    <div class="col-25">
     <label for="pass">Partite giocate</label>
    </div>
    <div class="col-75">
      <input type="text" id="gp" name="playergp" placeholder="inserisci num partite"> 
    </div>
  </div>
      <div class="row">
    <div class="col-25">
     <label for="pass">Minuti giocati</label>
    </div>
    <div class="col-75">
      <input type="text" id="min" name="playermin" placeholder="inserisci minuti giocati"> 
    </div>
  </div>
        <button type="submit" >Crea</button>
  
</form>

</td>
</tr>
<tr>
<td>



<form id="floatright" action="DeviceServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">Battito cardiaco</label>
    </div>
    <div class="col-75">
      <input type="text" id="heartbeat" name="playerheartbeat" placeholder="inserisci battito giocatore">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Pressione sanguigna</label>
    </div>
    <div class="col-75">
      <input type="text" id="pressure" name="playerpressure" placeholder="inserisci pressione giocatore"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">Frequesnza respiratoria</label>
    </div>
    <div class="col-75">
      <input type="text" id="breath" name="playerbreath" placeholder="inserisci respiri min giocatore"> 
    </div>
  </div>
      <button type="submit" >Crea</button>
</form>
	
	</td>
</tr>

-->

	
	
</div>
<br>
<%@ include file="../css/footer.jsp" %>	
</body>
</html>