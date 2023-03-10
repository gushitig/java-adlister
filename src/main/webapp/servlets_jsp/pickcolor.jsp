<%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/9/23
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick A Color</title>
</head>
<body>
<form ACTION="/pickcolor" METHOD="POST">
  <label for="color">Pick a color:</label><br>
  <input type="text" id="color" name="color"><br>
  <INPUT TYPE="submit" VALUE="Submit">
</form>
</body>
</html>
