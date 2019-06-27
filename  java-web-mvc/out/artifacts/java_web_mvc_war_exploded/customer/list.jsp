<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/25/2019
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customer</h1>
<p>
    <a href="/customers?action=create">Create new customer</a>
</p>
<table bodercolor = red width = "50%" border = "1" cellspacing = 1
       cellpadding = "4" align = left>
    <tr>
        <td><b>Name</b></td>
        <td><b>Email</b></td>
        <td><b>Address</b></td>
        <td><b>Edit</b></td>
        <td><b>Delete</b></td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a> </td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
