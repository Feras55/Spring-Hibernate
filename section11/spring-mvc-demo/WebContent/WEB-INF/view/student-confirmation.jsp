<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head> 
	<title>Student Confirmation</title>
</head>

<body>
	
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	You are from: ${student.country}
	<br>
	Your favorite Language is: ${student.favoriteLanguage}
	
	<br>
	Your favorite OS are:
	<ul>
		<c:forEach var = "temp" items = "${student.favoriteOperatingSystems}">
		
			<li> ${temp} </li>
			
		</c:forEach>
	</ul>
</body>

</html>