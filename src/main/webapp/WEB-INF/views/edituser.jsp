<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2017/8/16
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="./common/head.jsp" %>
<html>
<head>
    <title>编辑页面</title>
    <%@include file="./common/tag.jsp"%>
</head>
<body>
<div class="container">
    <form action="/user/saveOrUpdate" method="post">
        <div class="form-group">
            <label >用户id</label>
            <input type="text" class="form-control"  placeholder="id" name="id" value="${user.id}">
        </div>
        <div class="form-group">
            <label >用户名</label>
            <input type="text" class="form-control"  placeholder="用户名" name="name" value="${user.name}">
        </div>
        <div class="form-group">
            <label >Password</label>
            <input type="password" class="form-control"  placeholder="Password" name="pwd" value="${user.pwd}">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>
