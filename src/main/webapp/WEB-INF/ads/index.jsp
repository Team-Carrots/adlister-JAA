<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="//WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="//WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>HERE ARE ALL THE ADS!</h1>
    <br>
    <c:forEach var="ad" items="${ads}">
        <div class="adsContainer">
            <h2 class="adHeader">${ad.title}</h2>
            <p class="adBody">${ad.description}</p>
        </div>
        </div>
    </c:forEach>
</div>

</body>
</html>
