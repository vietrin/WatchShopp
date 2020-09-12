<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chủ</title>
</head>
<body>
	<h1>Đã vào trang chủ
	</h1>
	<table border="1">
	<tr>
		<td>Tên sản phẩm </td>
		<td>Giá  </td>
		<td>Giảm giá </td>
		<td>Ảnh </td>
		<td>Công ty sản xuất </td>
	
		<td>Thêm vào giỏ hàng</td>
		<td>Xem chi tiết</td>
	
	</tr>
	<c:forEach var="p" items="${listProduct }">
	<tr>
		<td>${p.name }</td>
		<td>${p.price }</td>
		<td>${p.discount }</td>
		<td>${p.image }</td>
		<td>${p.company }</td>
		<td><a href="addCart/${p.id }">them</a></td>
		<td><a href="san-pham/${p.key}">xem</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>