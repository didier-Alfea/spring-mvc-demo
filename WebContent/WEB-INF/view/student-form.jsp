<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head></head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
		<!-- at loading Spring MVC call the getters -->
		First name: <form:input path="firstName"/>
		<br><br>
		Last name: <form:input path="lastName"/>
		
		<br><br>
	
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
		<br><br>
		
		<!-- at submit Spring MVC call the setters -->
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>