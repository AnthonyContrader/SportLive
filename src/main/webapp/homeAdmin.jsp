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
<title>essere o non essere</title>
</head>
<body>
<h1>Oooops! non dovevi vedere questa pagina</h1>



<a href="/index.jsp">Esci</a>

</body>
</html>