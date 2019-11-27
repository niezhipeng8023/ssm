<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/27
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${pageScope.users}" var="user" >
      <c:out value="${user.username} "/>
</c:forEach>

<c:forEach items="${users}" var="user" >
    <tr>
        <th>用户名</th>
        <th>密码</th>

    </tr>
    <tr>
        <td> ${user.username}</td>
        <td>${user.password}</td>


    </tr>

</c:forEach>

</body>
</html>
