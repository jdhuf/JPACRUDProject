<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Player</title>
</head>
<body>	
	<a href="index.do">Home</a> 
	
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
		
		<label for="id"> <strong>Player Id:</strong></label> <br>
		 <input type="text" name="id" size="25"
			value="${player.id}" readonly /> <br> <br>
			
			<label for="name"><strong>Name:</strong></label> <br>
		<input type="text" name="updateName" size="25" value="${player.name}" /> <br> <br>
		
		<label for="birthdate"><strong>Birthdate:</strong></label> <br>
		<input type="text"
			name="birthdate" size="25" value="${player.birthdate}" /> <br> <br>
			
		<label for="position"><strong>Position:</strong></label> <br>
		<input type="text" name="position"
			size="25" value="${player.position}" /> <br> <br>
			
			<label
			for="homeTown"><strong>Home Town</strong></label> <br>
			<input type="text"
			name="homeTown" size="25" value="${player.homeTown}" /> <br> <br>
			
		<label for="nationality"><strong>Nationality</strong></label> <br>
		<input type="text"
			name="nationality" size="25" value="${player.nationality}" /> <br> <br>
			
			 <label
			for="height"><strong>Height:</strong></label> <br>
			<input type="text" name="height"
			size="25" value="${player.height}" /> <br> <br>
			
			<label
			for="weight"><strong>Weight:</strong></label> <br>
			<input type="text"
			name="weight" size="25" value="${player.weight}" /> <br> <br>
			
		<br> <input type="submit" value="Update This Player" />
	</form>
	

</body>
</html>