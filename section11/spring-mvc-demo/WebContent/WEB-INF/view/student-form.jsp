<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head> 
	<title>Student Form</title>
</head>

<body>

	<form:form action ="processForm" modelAttribute ="student">
		
		First Name: <form:input path="firstName" />
		
		<br><br>
		
		Last Name: <form:input path="lastName" />
		
		<br><br>
		<br><br>
		Country:
		<form:select path="country">
			<form:options items= "${student.countries}"/>
		</form:select>
		
		<input type ="submit" value="Submit"/>
	</form:form>
</body>

</html>