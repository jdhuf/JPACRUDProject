<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Roster</title>
</head>
<body>

	${DEBUG }
	<!-- TEST -->

	<h1>Welcome to Team Roster Site</h1>



	<!-- 
<h3>Search for a Player by Player ID</h3>
	<form action="FindPlayerByID.do" method="GET">
		Player ID: <input type="text" name="playerID" size="5" /> <input
			type="submit" value="Search by ID" />
	</form>
	<br> -->




	<form action="getPlayer.do" method="GET">
		Player ID: <input type="text" name="pid" /> <input type="submit"
			value="Show Player" />
	</form>
	<br>


	<form action="deletePlayer.do" method="GET">
		Player ID: <input type="text" name="destroyId" /> <input
			type="submit" value="Delete Player" />
	</form>
	<br>


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

			<c:forEach var="player" items="${playersAll}">
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


	<h3>Add a new player to roster:</h3>

	<form action="addPlayer.do" method="POST">
		<label for="playerName"> <strong>Enter name:</strong></label> 
		<input type="text" name="createName" size="25" /> <br> 
		<label for="birthdate"> <strong>Enter birthdate:</strong></label> 
				<input type="text" name="birthdate" size="25" /> <br>

		<label for="position"> <strong>Enter position:</strong></label> 
		<input type="text" name="position" size="25" /> <br> 
		
		<label for="homeTown"> <strong>Enter home town:</strong></label> 
		<input type="text" name="homeTown" size="25" /> <br> 
			
		<label for="nationality"> <strong>Enter nationality:</strong></label> 
		<input type="text" name="nationality" size="25" /> <br> 
			
		<label for="height"> <strong>Enter height:</strong></label> 
		<input type="text" name="height" size="25" /> <br> 
			
		<label for="weight"> <strong>Enter weight:</strong>
		</label> <input type="text" name="weight" size="25" /> <br> 
		

		<input type="submit" value="Add Player" />

	</form>


</body>
</html>