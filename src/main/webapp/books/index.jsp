<%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/13/23
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Here are all the books!</h1>
<c:forEach var="book" items="${books}">
    <h2>${book.title}</h2>
    <h2>By: ${book.author}</h2>

</c:forEach>

</body>
</html>
