<%--
  Created by IntelliJ IDEA.
  User: AndrewBall
  Date: 5/7/20
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="//WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Create a new Ad</h1>
    <form action="/ads/images" method="post">
        <div class="form-group">
            <label for="path">Path</label>
            <input id="path" name="path" class="form-control" type="text">
        </div>
        <input type="hidden" name="adId" id="adId" value="${adId}">
        <input type="submit" class="btn btn-block btn-primary">
    </form>
</div>
</body>
</html>
