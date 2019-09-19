
<%--
  Created by IntelliJ IDEA.
  User: zpyu521
  Date: 2019/9/19
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-3.4.1.min.js"></script>

    <script type="text/javascript">

        alert($);


    </script>
</head>
<body>
<select id="dept1"  name="dept">
    <option>请选择</option>

    <c:forEach items="${deptList}" var="dept">
        <option  value="${dept.id}">${dept.loginName}</option>
    </c:forEach>

</select>
</body>
</html>
