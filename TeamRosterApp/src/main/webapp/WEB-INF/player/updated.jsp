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

</body>
</html>