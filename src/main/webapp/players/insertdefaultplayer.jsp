<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Player default</title>
</head>
<body>



<form id="floatright" action="UserServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="idcoach">idcoach</label>
    </div>
    <div class="col-75">
      <input type="text" id="idcoach" name="idcoachP" placeholder="inserisci idcoach">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="nickname">nickname</label>
    </div>
    <div class="col-75">
      <input type="text" id="nickname" name="nicknameplayer" placeholder="inserisci nickname">
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
      <label for="score">score</label>
    </div>
    <div class="col-75">
      <input type="text" id="score" name="scoreplayer" placeholder="inserisci score">
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
      <button type="submit" >Insert</button>
</form>





</body>
</html>