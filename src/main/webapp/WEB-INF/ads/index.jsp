<%@ page import="Adlister.Ad" %><%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/10/23
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="/WEB-INF/ads/partials/head.jsp" %>
    <title>RRRadLister Listings</title>
</head>
<body>
<%@ include file="/WEB-INF/ads/partials/navbar.jsp" %>

<h2>Listings</h2>

<c:forEach items="${ads}" var="ad">
    <div>
        <h5>${ad.title}</h5>
        <p>${ad.description}</p>
        <br>
    </div>
</c:forEach>

<br>
<br>
<br>
<br>
<br>
<br>
<br>


<%@ include file="/WEB-INF/ads/partials/footer.jsp" %>
</body>
</html>
