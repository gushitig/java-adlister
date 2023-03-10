<%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/9/23
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<form ACTION="/guess" METHOD="POST">
  <label for="guess">Pick a number from 1 to 3:</label><br>
  <input type="text" id="guess" name="guess"><br>
  <INPUT TYPE="submit" VALUE="Submit">
</form>

</body>
</html>
