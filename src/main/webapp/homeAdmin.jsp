<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@	page import="it.contrader.dto.UserDTO"%>



<jsp:include page="/User/userManagement" flush="true"/>
	<%
	
		System.out.println("chiamata della request");
		//request.getRequestDispatcher("/User/userManagement");
		System.out.println("request chiamata");

		List<UserDTO> listUser = (List<UserDTO>) request.getAttribute("user");
		
		System.out.println("DTO list chiamata");

	 %>

<html>
<head>
</head>
<body>
<h1>HOME ADMIN</h1>

<!-- visualizzazione immediata della tabella  -->

<table>
<tr><td>Id</td><td>Username</td><td>Password</td><td>Name</td><td>Surname</td><td>UserType</td></tr>

		<%
			for(UserDTO user: listUser){
		 %>
		 	<tr>
		 		<td><%=user.getId()%></td>
		 		<td><%=user.getUsername()%></td>
		 		<td><%=user.getPassword()%></td>
		 		<td><%=user.getUsertype()%></td>
		 		<td><%=user.getName()%></td>
		 		<td><%=user.getSurname()%></td>
		 		
		 		<td><a class="btn btn-primary btn-lg btn-block" href="/User/deleteUser?id=<%=user.getId() %>">Delete</a></td>
		 		<td><a class="btn btn-primary btn-lg btn-block"href="/User/redirectUpdate?id=<%=user.getId()%>">Update</a></td>
		 	</tr>
		<% 
			}
		%>

</table>

<a href="/User/logut">Esci</a>

</body>
</html>