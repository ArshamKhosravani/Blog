<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Bahareh
  Date: 11/12/2020
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table>
    <th>
        <td></td>
        <td></td>
        <td></td>
    </th>

<c:forEach items="${users}" var="user">
    <tr>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
