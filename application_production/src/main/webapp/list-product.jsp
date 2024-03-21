<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>List Products</title>
</head>
<body>
<h1>List of Products</h1>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Description</th>
    <th>Manufacturer</th>
  </tr>
  <c:forEach items="${products}" var="product">
    <tr>
      <td>${product.id}</td>
      <td>${product.name}</td>
      <td>${product.price}</td>
      <td>${product.description}</td>
      <td>${product.manufacturer}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
