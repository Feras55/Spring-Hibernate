<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Customer Confirmation Page</title>
</head>


<body>

<h1>Welcome to the Confirmation Page</h1>
<h2> Hello Mr. ${customer.firstName} ${customer.lastName}</h2>
<br>
<h2>You have ${customer.freePasses} free passes</h2>
<br>
<h2>Your postal code is: ${customer.postalCode}</h2>




</body>



</html>