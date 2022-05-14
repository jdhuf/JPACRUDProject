<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Roster</title>
</head>
<body>

${DEBUG }  <!-- TEST -->

<h1>Welcome to Team Roster Site</h1>

	<form action="getPlayer.do" method="GET">
		Player ID: <input type="text" name="pid" /> <input type="submit"
			value="Show Player" />
	</form>

	<table>
		<thead>
			<tr>

				<th>ID</th>
				<th>Name</th>
				<th>Birthdate</th>
				<th>Position</th>
				<th>Home Town</th>
				<th>Nationality</th>
				<th>Height</th>
				<th>Weight</th>
				
			</tr>

		</thead>

		<tbody>

			<c:forEach var="player" items="${players}">
				<tr>
					<td>${player.id }</td>
					<td><a href="getPlayer.do?pid=${player.id}"> ${player.name }</a></td>
					<td>${player.birthdate }</td>
					<td>${player.position }</td>
					<td>${player.homeTown }</td>
					<td>${player.nationality}</td>
					<td>${player.height }</td>
					<td>${player.weight }</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>