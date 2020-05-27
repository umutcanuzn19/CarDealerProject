<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>biseyler gelecek buraya</h2>
	<c:choose>
		<c:when test="${fn:length(dealers) > 0}">
			<table class="box">
				<tr>
					<th></th>
					<th>ID</th>
					<th>First Name (dil secenegi)</th>
					<th>Last Name()</th>
					<th></th>
				</tr>
				<c:forEach items="${car}" var="c">
					<c:forEach items="${dealers}" var="d">
						<tr>
							<td><a href="/form/delete/${d.id}"><img
									src="/img/delete-sign--v2.png" width="20" /></a></td>
							<td>${d.id}</td>
							<td>${d.fName}</td>
							<td>${d.lName}</td>
							<td>${c.carBrand}</td>
							<td>${c.carModel}</td>
							<td>${c.carPrice}</td>
							<td></td>
							<td><a href="/form/${d.id}">More</a></td>
						</tr>
					</c:forEach>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<p>No data found.</p>
		</c:otherwise>
	</c:choose>

</body>
</html>