<%--
  Created by IntelliJ IDEA.
  User: cantonuccio
  Date: 3/8/23
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="/WEB-INF/ads/partials/head.jsp" %>
<body>
<%@ include file="/WEB-INF/ads/partials/navbar.jsp" %>




<form ACTION="/login" METHOD="POST" id="login">
    <label for="uname">Username:</label><br>
    <input type="text" id="uname" name="uname"><br>
    <label for="pass">Password:</label><br>
    <input type="text" id="pass" name="pass"><br>
    <INPUT TYPE="submit" VALUE="Submit">
</form>


<%@ include file="/WEB-INF/ads/partials/footer.jsp" %>

</body>
</html>
