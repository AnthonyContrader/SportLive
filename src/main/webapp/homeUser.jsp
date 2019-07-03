<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List"
    import="it.contrader.dto.UserDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<UserDTO> list = (List<UserDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>Username</th>
			<th>Password</th>
			<th>Ruolo</th>
			<th>E-Mail</th>
			<th></th>
		</tr>
		<%
			for (UserDTO u : list) {
		%>
		<tr>
			<td><a<%=u.getIdUser()%>>
			<%=u.getUsername()%></a></td>
			<td><%=u.getPassword()%></td>
			<td><%=u.getRuolo()%></td>
			<td><%=u.getEmail()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>