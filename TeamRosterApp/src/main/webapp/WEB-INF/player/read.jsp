<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player Found</title>
</head>
<body>

	<h1>READ</h1>
	

	
	<div>
 		<h5>Name: ${player.name}</h5>
		<h5>Birthdate: ${player.birthdate}</h5>
		<h5>Position: ${player.position}</h5>
		<h5>Home Town: ${player.homeTown}</h5>
		<h5>Nationality: ${player.nationality}</h5>
		<h5>Height: ${player.height}</h5>
		<h5>Weight: ${player.weight}</h5> 
		
	</div> 
	
 	<h3>Update a player you previously added:</h3>
	<form action="updatePlayer.do" method="POST">
		
		<label for="id">Player Id:</label> <input type="text" name="id" size="5"
			value="${player.id}" readonly /> <br> 
			
			<label for="name">Name:</label>
		<input type="text" name="updateName" size="30" value="${player.name}" /> <br>
		
		<label for="birthdate">Birthdate:</label> <input type="text"
			name="birthdate" size="5" value="${player.birthdate}" /> <br>
			
		<label for="position">Position:</label> <input type="text" name="position"
			size="20" value="${player.position}" /> <br> 
			
			<label
			for="homeTown">Home Town:</label> <input type="text"
			name="homeTown" size="7" value="${player.homeTown}" /> <br>
			
		<label for="nationality">Nationality:</label> <input type="text"
			name="nationality" size="7" value="${player.nationality}" /> <br>
			
			 <label
			for="height">Height:</label> <input type="text" name="height"
			size="7" value="${player.height}" /> <br> 
			
			<label
			for="weight">Weight:</label> <input type="text"
			name="weight" size="7" value="${player.weight}" /> <br>
			
		<br> <input type="submit" value="Update This Player" />
	</form>
	
	<a href="index.do">Home</a> 

</body>
</html>