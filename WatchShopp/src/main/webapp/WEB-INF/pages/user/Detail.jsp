<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Thông tin sản phẩm</title>
</head>
<body>
	<h1>Thông tin chi tiết</h1>
	<table>
		<tr>
			<td>${product.name }</td>
			<td>${product.price }</td>
			<td>${product.discount }</td>
			<td>${product.company }</td>
			<td>${product.image }</td>
		</tr>
	</table>
</body>
</html>