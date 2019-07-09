<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserimento palyer</title>
</head>
<body>



<div class="row">
        	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        		<form class="insert-form" action="/Coach/playerInsert" method="post">
		<table>
			<tr>
				<td>Nickname</td><td><input type="text" name="nickname" placeholder="Nickname"></td>
			</tr>
			
			<tr>
				<td>Password</td><td><input type="text" name="password" placeholder="Password"></td>
			</tr>
			
			<tr>
				<td>Score</td><td><input type="text" name="score" placeholder="Score"></td>
			</tr>
			
		</table>
		<br>
		<button class="btn btn-primary btn-lg btn-block" type="submit">Insert</button>
	</form>
</div>
</div>
</body>
</html>