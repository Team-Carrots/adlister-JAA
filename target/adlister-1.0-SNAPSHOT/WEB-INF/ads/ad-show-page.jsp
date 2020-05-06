<%--
  Created by IntelliJ IDEA.
  User: AndrewBall
  Date: 5/5/20
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="//WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing One Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="//WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Are you interested in this item from ${userAd.username}</h1>
    <br>
    <br>
    <div class="adsContainer">
            <h2 class="adHeader">${oneAd.title}</h2>
            <p class="adBody">${oneAd.description}</p>
    </div>
</div>


</body>
</html>