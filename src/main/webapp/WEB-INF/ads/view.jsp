<%--
  Created by IntelliJ IDEA.
  User: AndrewBall
  Date: 5/7/20
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="View an Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="//WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>id="title" </h1>
    <div class="adsContainer">
        <h2 class="adHeader">${ad.title}</h2>
        <p class="adBody">${ad.description}</p>
    </div>
</div>
</body>
</html>
