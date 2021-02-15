<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
</head>
<body>
	<h1><spring:message code="title" /></h1>
	<form:form modelAttribute="registration">
		<table>
			<tr>
				<td>
					<spring:message code="name" />
				</td>
				<td>
					<form:input path="name" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value=<spring:message code ="add" />/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>