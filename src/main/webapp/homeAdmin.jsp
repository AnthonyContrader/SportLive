<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@	page import="it.contrader.dto.UserDTO"%>



<jsp:include page="/User/userManagement" flush="true"/>
	<% 
		List<UserDTO> listUser = (List<UserDTO>) request.getAttribute("user");
	 %>

<html>
<head>
<title>Sportlive</title>
</head>
<body>
<h1></h1>



<a href="/index.jsp">Esci</a>

</body>
</html>