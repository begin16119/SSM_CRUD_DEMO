<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2017/8/16
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/head.jsp"%>
<html>
<head>
    <title>用户列表页</title>

    <%@include file="common/tag.jsp"%>
</head>
<body>
    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading text-center">
                <h2>用户列表页</h2>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/user/add">新增</a>
            </div>
            <div class="panel-body">
                <table class="table table-hover">
                    <thead>
                        <tr>
                        <th>用户id</th>
                        <th>用户名</th>
                        <th>密码</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="u" items="${list}">
                            <tr>
                                <td>${u.id}</td>
                                <td>${u.name}</td>
                                <td>${u.pwd}</td>
                                <td>
                                    <a class="btn btn-warning" href="${pageContext.request.contextPath}/user/edit?id=${u.id}">修改</a>
                                    <a class="btn btn-danger" href="${pageContext.request.contextPath}/user/deleteById?id=${u.id}">删除</a>
                                </td>
                            </tr>

                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div></div>
        </div>
    </div>
</body>
</html>
