<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2017/8/16
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/head.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/addUser" method="post">
    <div class="form-group">
        <label >用户id</label>
        <input type="text" class="form-control"  placeholder="id" name="id">
    </div>
    <div class="form-group">
        <label >用户名</label>
        <input type="text" class="form-control"  placeholder="用户名" name="name">
    </div>
    <div class="form-group">
        <label >Password</label>
        <input type="password" class="form-control"  placeholder="Password" name="pwd">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>

</html>
