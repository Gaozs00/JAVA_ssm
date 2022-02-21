<%--
  Created by IntelliJ IDEA.
  User: ☆森☆
  Date: 2022/2/18
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="dept" items="${list}">
    ${dept.deptno}
    ${dept.dname}
    ${dept.loc}<br>
</c:forEach>

</body>
</html>
