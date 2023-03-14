<%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/13/23
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%@ include file="/partials/head.jsp" %>
    <title>RRRadLister Listings</title>
</head>

<%@ include file="/partials/navbar.jsp" %>

<body>
<div class="container">
    <h1>Create a new Ad</h1>
    <form action="/ads/create" method="post">
        <div class="form-group">
            <label for="title">Title</label>
            <input id="title" name="title" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <textarea id="description" name="description" class="form-control" type="text"></textarea>
        </div>
        <input type="submit" class="btn btn-block btn-success">
    </form>
</div>


<%@ include file="/partials/footer.jsp" %>

</body>
</html>
