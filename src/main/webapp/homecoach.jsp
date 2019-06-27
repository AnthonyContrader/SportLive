<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.UserDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Coach</title>
<link href="css/vittoriostyle.css" rel="stylesheet">
</head>
<body>

<%@include file="css/header.jsp"%>


<div class="navbar">
  <a class="active" href="homecoach.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Players</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>

<div class="main">
<h1>Welcome ${coach.getUsername()}</h1>

"Pagina del COACH, permettera al coach già nella home di cisualizzare la formazione consigliati divisa in 4 categorie di gioctori (attacante, centrocampista, difensore, portiere),"
"organizandoli in una lista singola per ogni tipo e posizionando in ordine decrescente i giocatori più consigliati al gioco"


</div>


<%@ include file="css/footer.jsp" %>

</body>
</html>