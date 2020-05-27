<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter New Form</title>
</head>
<body>
	<h2>Enter New Form</h2>
	<p>Please fill the following form
	<p>


		<form:form method="post" action="/form/add" modelAttribute="dealer">
			<table>

				<tr>
					<td><spring:message code="firstNamelabel" /></td>
					<td><form:input path="fName" /></td>
					<td><form:errors path="fName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="lastNamelabel" /></td>
					<td><form:input path="lName" /></td>
					<td><form:errors path="lName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="eMaillabel" /></td>
					<td><form:input path="eMail" /></td>
					<td><form:errors path="eMail" cssClass="error" /></td>
				</tr>
				<tr>

					<td>E-mail dogrulama</td>

				</tr>
				<form:form method="post" action="/form/add" modelAttribute="car">

					<tr>
						<td><spring:message code="carBrandlabel" /></td>
						<td><form:select path="carBrand">
								<form:option value="" label="Please Select Brand" />
								<form:option value="Item 1" label="Alfa Romeo" />
								<form:option value="Item 2" label="Aston Martin" />
								<form:option value="Item 3" label="Audi" />
								<form:option value="Item 4" label="BMW" />
								<form:option value="Item 5" label="Bentley" />
								<form:option value="Item 6" label="Cadillac" />
								<form:option value="Item 7" label="DS" />
								<form:option value="Item 8" label="Honda" />
								<form:option value="Item 9" label="Jaguar" />
								<form:option value="Item 10" label="Mercedes" />
								<form:option value="Item 11" label="Volkswagen" />
								<form:option value="Item 12" label="Skoda" />
							</form:select></td>
						<td><form:errors path="carBrand" cssClass="error" /></td>
					</tr>

					<tr>
						<td><spring:message code="carModellabel" /></td>
						<td><form:input path="carModel" /></td>
						<td><form:errors path="carModel" cssClass="error" /></td>
					</tr>
					<tr>
						<td><spring:message code="carCodelabel" /></td>
						<td><form:input path="carCode" /></td>
						<td><form:errors path="carCode" cssClass="error" /></td>
					</tr>
					<tr>
						<td><spring:message code="carDatelabel" /></td>
						<td><form:input path="carDate" /></td>
						<td><form:errors path="carDate" cssClass="error" /></td>
					</tr>
					<tr>
						<td><spring:message code="carCaselabel" /></td>
						<td><spring:message code="Cases1" /> <form:radiobutton
								path="carCase" value="Item 1" label=" " /></td>
						<td><spring:message code="Cases2" /> <form:radiobutton
								path="carCase" value="Item 2" label=" " /></td>
						<td><form:errors path="carCase" cssClass="error" /></td>
					</tr>
					<tr>
						<td><spring:message code="carPricelabel" /></td>
						<td><form:input path="carPrice" /></td>
						<td><form:errors path="carPrice" cssClass="error" /></td>
					</tr>

					<tr>
						<td colspan="3"><input type="submit" value="Submit" /></td>
					</tr>
					</form:form>
			</table>

		


		</form:form>
</body>
</html>