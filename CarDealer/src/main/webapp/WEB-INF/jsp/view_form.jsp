<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="post" action="/form/view" modelAttribute="car">
			<form:form method="post" action="/form/view" modelAttribute="dealer">

				<table>
					<tr>
						<td><spring:message code="firstNamelabel" /></td>
						<td>${dealer.fName}</td>
					</tr>
					<tr>
						<td><spring:message code="lastNamelabel" /></td>
						<td>${dealer.lName}</td>
					</tr>
					<tr>
						<td><spring:message code="eMaillabel" /></td>
						<td>${dealer.eMail}</td>
					</tr>
					

					
					</form:form>


					<tr>
						<td><spring:message code="carBrandlabel" /></td>
						<td>${car.carBrand}</td>						
					</tr>
					<tr>
						<td><spring:message code="carModellabel" /></td>
						<td>${car.carModel}</td>
					</tr>
					<tr>
						<td><spring:message code="carCodelabel" /></td>
						<td>${car.carCode}</td>
					</tr>
					<tr>
						<td><spring:message code="carDatelabel" /></td>
						<td>${car.carDate}</td>
					</tr>
					<tr>
						<td><spring:message code="carCaselabel" /></td>
						<td>${car.carCase}</td>
					</tr>
					<tr>
						<td><spring:message code = "carPricelabel"/></td>
						<td>${car.carPrice}</td>
						<td><form:input path="carPrice"/></td>
						<td><form:errors path="carPrice" cssClass="error" /></td>
					</tr>
				</table>
			</form:form>
</body>
</html>