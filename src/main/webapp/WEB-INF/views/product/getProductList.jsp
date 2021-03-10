<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="prd" items="${list }">
		<table border="1">
			<tr>
				<td>${prd.product_id }</td>
			</tr>
			<tr>
				<td>${prd.product_name }</td>
			</tr>
			<tr>
				<td>${prd.product_price }</td>
			</tr>
			<tr>
				<td>${prd.product_info }</td>
			</tr>
			<tr>
				<td>${prd.product_date }</td>
			</tr>
			<tr>
				<td>${prd.company }</td>
			</tr>
			<tr>
				<td>${prd.manager_id }</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>